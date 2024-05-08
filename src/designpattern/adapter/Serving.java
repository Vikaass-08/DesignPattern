package designpattern.adapter;

import designpattern.adapter.cafe.*;
import designpattern.adapter.store.*;

import java.util.ArrayList;
import java.util.List;

public class Serving {
  List<Order> orderDetails = new ArrayList<>();


  // We have Added adapter Change One type into another to fit a particular format
  public void addStoreItemToList(Item item) {
    CafeAdapter cafeAdapter = new CafeAdapter(item);
    this.orderDetails.add(cafeAdapter);
  }

  public void addCafeItemToList(Order ord) {
    this.orderDetails.add(ord);
  }

  public void printOrders() {
    for(Order order: orderDetails) {
      System.out.println(order.getOrderName() + " => " + order.getOrderPrice());
    }
  }
}
