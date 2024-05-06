package designpattern.adapter.Store;

import designpattern.adapter.Cafe.*;

public class CafeAdapter implements Order {

  private Item item;

  public CafeAdapter(Item item) {
    this.item = item;
  }

  @Override
  public String getOrderPrice() {
    return this.item.getItemPrice();
  }

  @Override
  public String getOrderName() {
    return this.item.getItemName();
  }
}
