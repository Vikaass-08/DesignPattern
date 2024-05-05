package designpattern.abstractfactory;

import designpattern.abstractfactory.UIFactory.UIFactory;
import designpattern.abstractfactory.UIFactory.WindowFactory;
import designpattern.abstractfactory.UIFactory.MacFactory;

public class Client {
  public static void main(String[] args) {
    UIFactory mac = new MacFactory();
    mac.createButton().click();
    mac.createTextBox().showText();

    UIFactory window = new WindowFactory();
    window.createButton().click();
    window.createTextBox().showText();
  }
}
