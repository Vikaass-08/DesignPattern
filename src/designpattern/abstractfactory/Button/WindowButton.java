package designpattern.abstractfactory.Button;
public class WindowButton implements Button {
  @Override
  public void click() {
    System.out.println("Window button in clicked");
  }
}
