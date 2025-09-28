package designpattern.composite.department;

public class DeveloperDepartment implements Department{
  private final int id;
  private final String name;

  public DeveloperDepartment(int id, String name) {
    this.id = id;
    this.name = name;
  }
  @Override
  public void departmentName() {
    System.out.println(this.name);
  }

  @Override
  public int getDepartmentId() {
    return id;
  }
}
