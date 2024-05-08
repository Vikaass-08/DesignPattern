package designpattern.Composite.Department;

public class DeveloperDepartment implements Department{
  private int id;
  private String name;

  public DeveloperDepartment(int id, String name) {
    this.id = id;
    this.name = name;
  }
  @Override
  public void departmentName() {
    System.out.println(this.name);
  }
}
