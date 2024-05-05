package designpattern.factory.OperatingSystem;

public class MacOS extends OperatingSystem{

  public MacOS(String version) {
    super(version);
  }
  @Override
  public void changeDir() {
    System.out.println("Mac change directory operation");
  }

  @Override
  public void removeDir() {
    System.out.println("Mac remove directory operation");
  }
}
