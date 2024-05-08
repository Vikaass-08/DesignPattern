package designpattern.adapter.store;

public class Store implements Item{
  @Override
  public String getItemName() {
    return "Soap";
  }

  @Override
  public String getItemPrice() {
    return "50.0";
  }
}
