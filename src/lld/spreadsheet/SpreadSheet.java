package lld.spreadsheet;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SpreadSheet {
    private final String[][] sheet;
    private final List<String> operators = List.of("*", "/", "+", "-");
    private boolean[][] visited;

    public SpreadSheet(String[][] sheet) {
        this.sheet = sheet;
    }

    public double getValue(String cell) {
        this.visited = new boolean[this.sheet.length][this.sheet[0].length];
        return this.getValueOfCell(cell);
    }

    private double getValueOfCell(String cell) {

        // Resolve Expression to array: "A1 + B2 / C3" => [A1, +, B2, C3]
        List<String> splits = this.splitExpression(cell);

        if(splits.size() == 1) {

            if(!this.isReferenceToCell(cell)) return Double.parseDouble(cell);

            int[] cellNumber = this.getCellNumber(splits.getFirst());

            if(!isValidCell(cellNumber)) throw new RuntimeException("Invalid Cell Found");

            if(this.visited[cellNumber[0]][cellNumber[1]]) throw new RuntimeException("Cyclic Dependencies found");
            this.visited[cellNumber[0]][cellNumber[1]] = true;

            double val =  this.getValueOfCell(this.sheet[cellNumber[0]][cellNumber[1]]);
            this.visited[cellNumber[0]][cellNumber[1]] = false;
            return val;
        }

        // (A1 + B2 / C3) => Single Value after this loop
        for(String operation: this.operators) {
            splits = this.evaluate(splits, operation);
        }

        if(splits.size() > 1) throw new RuntimeException("Something wrong happen");
        return this.getValueOfCell(splits.getFirst());
    }


    private boolean isValidCell(int[] cellNumber) {
        return cellNumber[0] < this.sheet.length && cellNumber[0] >= 0 && cellNumber[1] < this.sheet[0].length && cellNumber[1] >= 0;
    }


    private List<String> splitExpression(String cell) {
        List<String> splits = new ArrayList<>();
        int lastAddedIndex = 0;
        for(int i = 0; i < cell.length(); i++) {
            if(operators.contains(cell.charAt(i) + "") && i > 0) {
                splits.add(cell.substring(lastAddedIndex, i));
                splits.add(cell.charAt(i) + "");
                i++;
                lastAddedIndex = i;
            }
        }

        if(lastAddedIndex < cell.length()) {
            splits.add(cell.substring(lastAddedIndex));
        }

        return splits;
    }

    private int[] getCellNumber(String cell) {
        return new int[]{
                cell.charAt(0) - 'A',
                Integer.parseInt(cell.substring(1))
        };
    }

    private boolean isReferenceToCell(String cell) {
        return cell.charAt(0) >= 'A' && cell.charAt(0) <= 'Z';
    }

    private List<String> evaluate(List<String> splits, String operation) {
        Stack<String> evaluatedValue = new Stack<>();
        for(int i = splits.size() - 1; i >= 0; i--) {
            if(!operation.equals(splits.get(i))) {
                evaluatedValue.push(splits.get(i));
                continue;
            }
            if(this.operators.contains(splits.get(i)) && !operation.equals(splits.get(i))) {
                evaluatedValue.push(splits.get(i));
                continue;
            }
            if(evaluatedValue.isEmpty()) {
                evaluatedValue.push(splits.get(i));
                continue;
            }
            double prev = this.getValueOfCell(evaluatedValue.pop());
            double next = this.getValueOfCell(splits.get(i - 1));

            double eval = this.solve(prev, next, operation);

            evaluatedValue.push(eval + "");
            i--;
        }

        List<String> newSplit = new ArrayList<>();

        while(!evaluatedValue.isEmpty()) newSplit.add(evaluatedValue.pop());

        return newSplit;
    }

    private double solve(double a, double b, String operation) {
        return switch (operation) {
            case "/" -> a / b;
            case "*" -> a * b;
            case "+" -> a + b;
            default -> a - b;
        };
    }
}
