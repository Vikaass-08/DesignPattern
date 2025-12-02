package lld.spreadsheet;

public class Client {
    public static void main(String[] args) {
        String[][] sheet = {
                {"9", "A1+C2/D3", "5", "B4"},
                {"B4", "-10", "A3+D3", "6"},
                {"-23", "2", "9", "A1*B2"},
                {"A4", "0", "C1", "B3"}
        };
        SpreadSheet spreadSheet = new SpreadSheet(sheet);

        System.out.println(spreadSheet.getValue("A2"));
    }
}
