package designpattern.Composite;

import designpattern.Composite.Department.*;

/*
Composite Design Pattern is useful when we have an object that can contains another object into it.
ex: Tree

LinkedList {
 int val;
 List<LinkedList> children
}

 */
public class Client {
  public static void main(String[] args) {
    Department deveoperDepartment = new DeveloperDepartment(1, "Developer Department");
    Department financialDepartment = new FinancialDepartment(1, "Financial Department");

    HeadDepartment headDepartment = new HeadDepartment(1, "Head Department");
    headDepartment.addDepartmentToManage(financialDepartment);
    headDepartment.addDepartmentToManage(deveoperDepartment);

    headDepartment.departmentName();
  }
}
