package designpattern.factory.operatingsystem;

public class WindowOS extends OperatingSystem{

  public WindowOS(String version) {
    super(version);
  }
  @Override
  public void changeDir() {
    System.out.println("Window change directory operation");
  }

  @Override
  public void removeDir() {
    System.out.println("Window remove directory operation");
  }
}
