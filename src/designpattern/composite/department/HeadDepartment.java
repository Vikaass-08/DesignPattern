package designpattern.composite.department;

import java.util.*;

public class HeadDepartment implements Department{
  private final int id;
  private final String name;
  private final List<Department> manageDepartment;

  public HeadDepartment(int id, String name) {
    this.id = id;
    this.name = name;
    this.manageDepartment = new ArrayList<>();
  }

  public void addDepartmentToManage(Department department) {
    this.manageDepartment.add(department);
  }

  public void removeDepartmentToManage(Department department) {
    this.manageDepartment.remove(department);
  }

  @Override
  public void departmentName() {
    System.out.println(this.name);
    System.out.println("List of departments that are managed by " + this.name + " :");
    for(Department department: manageDepartment) {
      department.departmentName();
    }
  }

  @Override
  public int getDepartmentId() {
    return this.id;
  }
}
