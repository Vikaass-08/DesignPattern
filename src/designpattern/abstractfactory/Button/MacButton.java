package designpattern.abstractfactory.Button;


public class MacButton implements Button {
  @Override
  public void click() {
    System.out.println("Mac Button is clicked");
  }
}
