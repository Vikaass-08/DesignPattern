package designpattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 Singleton pattern states that only one object can be created of a Singleton class.
 Issues:
 1. In MultiThread there are changes that both thread tried to create object at the same time
    to avoid this we make class synchronized.
 2. If we Serialize data then it is possible to create different object.
 3. Reflection: Basically one class can access private constructor of another class using reflection

 */

public class Client {
  public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
    DBConnection db1 = DBConnection.getInstance();
    DBConnection db2 = DBConnection.getInstance();
    System.out.println("db1 and db2 both are same object => " + (db1.hashCode() == db2.hashCode()) );


    // Reflection ( To Solve this, create ENUM instead of a DBConnection Class)
    Constructor[] constructors = DBConnection.class.getDeclaredConstructors();
    Constructor constructor = constructors[0];
    constructor.setAccessible(true);
    DBConnection db3 = (DBConnection) constructor.newInstance();
    System.out.println("db1 and db3 both are not same object => " + (db1.hashCode() != db3.hashCode()) );


    // ENUM based solution
    DBInstanceEnum.INSTANCE.dbConnection();
  }
}
