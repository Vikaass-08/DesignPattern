package designpattern.abstractfactory.UIFactory;

import designpattern.abstractfactory.Button.Button;
import designpattern.abstractfactory.Button.MacButton;
import designpattern.abstractfactory.TextBox.MacTextBox;
import designpattern.abstractfactory.TextBox.TextBox;

public class MacFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public TextBox createTextBox() {
    return new MacTextBox();
  }
}
