/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
// @author Jarod Klion

public class Vendor {
  // Fields:
  private int price; //Cents
  private int stock;  //# of items
  private int deposit;  //Deposit
  private int change; //Change
  private Coins coin = new Coins(change);

  /**
   * Constructs a Vendor
   *
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */

  public Vendor(int price, int stock) {
    this.price = price;
    setStock(stock);
  }

  /**
   * Sets the quantity of items in stock.
   *
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty) {
    stock = qty;
  }

  /**
   * Returns the number of items currently in stock.
   *
   * @return number of items currently in stock (int)
   */
  public int getStock() {
    return stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   *
   * @param # of cents to add to the deposit (int)
   */
  public void addMoney(int cents) {
    deposit += cents;
  }

  /**
   * Returns the currently deposited amount (in cents).
   *
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit() {
    return deposit;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   *
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale() {

    boolean saleMade = false;
    if(stock > 0 && deposit >= price) {
        stock--;
        deposit -= price;
        saleMade = true;
    }
    change = deposit;
    deposit = 0;
    return saleMade;
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   *
   * @return number of cents in the current change (int)
   */
  public int getChange() {
    int tempChange = change;
    change = 0;
    return tempChange;
  }
}
