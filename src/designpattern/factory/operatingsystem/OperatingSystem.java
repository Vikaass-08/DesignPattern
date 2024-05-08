package designpattern.factory.operatingsystem;

public abstract class OperatingSystem {
  private String version;

  public OperatingSystem(String version) {
    this.setVersion(version);
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public void getVersion() {
    System.out.println("Version: " + this.version);
  }

  public abstract void changeDir();
  public abstract void removeDir();
}
