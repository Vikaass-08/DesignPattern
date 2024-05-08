package designpattern.factory;

import designpattern.factory.operatingsystem.*;

import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter OS Type :: ");
    String osType = sc.nextLine();
    System.out.println("Enter OS Version :: ");
    String version = sc.nextLine();

    OperatingSystem os = OperatingSystemFactory.getOsInstance(osType, version);
    os.changeDir();
    os.removeDir();
    os.getVersion();
  }
}
