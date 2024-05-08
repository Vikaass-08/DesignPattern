package designpattern.Composite.Department;

public class FinancialDepartment implements Department{
  private int id;
  private String name;

  public FinancialDepartment(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public void departmentName() {
    System.out.println(this.name);
  }
}
