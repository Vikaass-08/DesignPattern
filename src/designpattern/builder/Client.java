package designpattern.builder;

/*
Builder Design pattern is used when we have many possible ways to create an object.
We use this pattern to avoid writing constructor for each possible case.
 */

public class Client {
  public static void main(String[] args) {
    ComputerSetup cs = new ComputerSetup.ComputerSetupBuilder()
            .addKeyboard(true)
            .addMic(false)
            .addMonitor(true)
            .addMouse(true)
            .assemble();
    System.out.println(cs.toString());
  }
}
