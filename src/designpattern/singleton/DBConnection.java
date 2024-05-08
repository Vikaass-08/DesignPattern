package designpattern.singleton;

public class DBConnection {
  public static DBConnection instance = null;

  private DBConnection() {}

  public static DBConnection getInstance() {

    if(instance != null) return instance;

    // Thread Safe Locking
    synchronized (DBConnection.class) {

      // Check if instance is already created then return that instance
      if(instance == null) {
        instance = new DBConnection();
      }
      return instance;

    }
  }

  /**
   * This is the key method which is responsible during deserialization process
   * This method get invoked, and we are simply returning already created object
   * @return
   */
  protected Object readResolve() {
    return instance;
  }
}
