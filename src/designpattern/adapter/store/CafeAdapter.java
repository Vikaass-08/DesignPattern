package designpattern.adapter.store;

import designpattern.adapter.cafe.*;

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
