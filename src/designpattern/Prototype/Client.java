package designpattern.Prototype;

/*
Prototype Pattern is used to clone objects.
Suppose we have a object which is costly to create then we can store it inside a hashmap and clone it when required.
 */

public class Client {
  public static void main(String[] args) throws CloneNotSupportedException {
    BookShop bs = new BookShop();
    bs.setShopName("Ramesh book center");
    bs.addBooks();

    // Deep Copy of books (Basically we created a prototype that can be cloned and used)
    BookShop clonedBookShop = bs.clone();
    clonedBookShop.setShopName("Austin Book Store");

    // We are removing a book from bs, but this will not affect clonedBookShop
    bs.getBooks().remove(2);

    System.out.println(bs.toString());
    System.out.println(clonedBookShop.toString());
  }
}
