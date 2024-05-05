package designpattern.abstractfactory.UIFactory;

import designpattern.abstractfactory.Button.Button;
import designpattern.abstractfactory.TextBox.TextBox;

public interface UIFactory {
  public Button createButton();
  public TextBox createTextBox();
}
