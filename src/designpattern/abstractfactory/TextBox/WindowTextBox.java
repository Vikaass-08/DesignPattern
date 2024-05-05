package designpattern.abstractfactory.TextBox;

public class WindowTextBox implements TextBox {
  @Override
  public void showText() {
    System.out.println("Window text is shown");
  }
}
