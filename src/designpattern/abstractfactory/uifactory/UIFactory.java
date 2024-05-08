package designpattern.abstractfactory.uifactory;

import designpattern.abstractfactory.button.*;
import designpattern.abstractfactory.textbox.*;

public interface UIFactory {
  public Button createButton();
  public TextBox createTextBox();
}
