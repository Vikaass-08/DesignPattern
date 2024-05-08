package designpattern.abstractfactory.uifactory;

import designpattern.abstractfactory.button.*;
import designpattern.abstractfactory.textbox.*;

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
