package designpattern.abstractfactory;

import designpattern.abstractfactory.uifactory.UIFactory;
import designpattern.abstractfactory.uifactory.WindowFactory;
import designpattern.abstractfactory.uifactory.MacFactory;

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
