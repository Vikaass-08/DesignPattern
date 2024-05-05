package designpattern.factory.OperatingSystem;

public class OperatingSystemFactory {
  private OperatingSystemFactory(){}

  public static OperatingSystem getOsInstance(String os, String version) {
    switch (os.toUpperCase()) {
      case "WINDOW":
        return new WindowOS(version);
      case "MAC":
        return new MacOS(version);
      default:
        throw new IllegalArgumentException("OS Not supported");
    }
  }

}
