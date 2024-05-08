package designpattern.abstractfactory.uifactory;

import designpattern.abstractfactory.button.*;
import designpattern.abstractfactory.textbox.*;

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
