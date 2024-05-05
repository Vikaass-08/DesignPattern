package designpattern.abstractfactory.TextBox;

public class MacTextBox implements TextBox {
  @Override
  public void showText() {
    System.out.println("Mac Text is shown");
  }
}
