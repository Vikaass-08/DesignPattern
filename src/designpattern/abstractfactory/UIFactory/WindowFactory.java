package designpattern.abstractfactory.UIFactory;

import designpattern.abstractfactory.Button.Button;
import designpattern.abstractfactory.Button.WindowButton;
import designpattern.abstractfactory.TextBox.TextBox;
import designpattern.abstractfactory.TextBox.WindowTextBox;

public class WindowFactory implements UIFactory{
  @Override
  public Button createButton() {
    return new WindowButton();
  }

  @Override
  public TextBox createTextBox() {
    return new WindowTextBox();
  }
}
