package designpattern.singleton;

public enum DBInstanceEnum {
  INSTANCE;
  public void dbConnection() {
    System.out.println("dbConnection is always same for this Instance");
  }
}
