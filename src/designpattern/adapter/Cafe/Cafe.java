package designpattern.adapter.Cafe;

public class Cafe implements Order{

  @Override
  public String getOrderName() {
    return "Cold Coffee";
  }

  @Override
  public String getOrderPrice() {
    return "250.0";
  }
}
