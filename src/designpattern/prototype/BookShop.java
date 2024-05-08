package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

  private String shopName;
  private List<Book> books = new ArrayList<>();

  public String getShopName() {
    return this.shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public List<Book> getBooks() {
    return this.books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public void addBooks() {
    for(int i = 0; i < 4; i++) {
      Book book = new Book();
      book.setBookName("Book-" + i);
      book.setBookId(i);
      this.getBooks().add(book);
    }
  }

  @Override
  public String toString() {
    return "BookShop{" +
            "shopName='" + shopName + '\'' +
            ", books=" + books +
            '}';
  }

  @Override
  protected BookShop clone() throws CloneNotSupportedException {
    BookShop bs = new BookShop();

    for(Book book: this.getBooks()) {
      bs.getBooks().add(book);
    }

    return bs;
  }
}
