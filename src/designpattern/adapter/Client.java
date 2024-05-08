package designpattern.adapter;

import designpattern.adapter.cafe.*;
import designpattern.adapter.store.*;


/*

Adapter Design Pattern Allow Us to Change Incompatible Object, By making a wrapper that changes
one object type to another.

 */

public class Client {
  public static void main(String[] args) {
    Serving serving = new Serving();
    Order ord = new Cafe();
    Item item = new Store();
    serving.addStoreItemToList(item);
    serving.addCafeItemToList(ord);

    serving.printOrders();
  }
}
