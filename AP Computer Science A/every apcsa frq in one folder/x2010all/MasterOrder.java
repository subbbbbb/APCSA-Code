package x2010all;

import java.util.List;
import java.util.ArrayList;
// import java.util.Iterator;

public class MasterOrder
{
  /** The list of all cookie orders */
  private List<CookieOrder> orders;

  /** Constructs a new MasterOrder object. */
  public MasterOrder()
  { orders = new ArrayList<CookieOrder>(); }

  /** Adds theOrder to the master order.
   *  @param theOrder the cookie order to add to the master order
   */
  public void addOrder(CookieOrder theOrder)
  { orders.add(theOrder); }

  // Part (a)

  /** @return the sum of the number of boxes of all of the cookie orders
   */
  public int getTotalBoxes()
  {
    int total = 0;
    for (CookieOrder o : orders)
      total += o.getNumBoxes();
    return total;
  }

  // Part (b)

  /** Removes all cookie orders from the master order that have the same variety of
   *  cookie as cookieVar and returns the total number of boxes that were removed.
   *  @param cookieVar the variety of cookies to remove from the master order
   *  @return the total number of boxes of cookieVar in the cookie orders removed
   */

  public int removeVariety(String cookieVar)
  {
    int total = 0;
    for (int i = orders.size() - 1; i >= 0; i--)
    {
      CookieOrder o = orders.get(i);
      if (o.getVariety().equals(cookieVar))
      {
        total += o.getNumBoxes();
        orders.remove(i);
      }
    }
    return total;
  }

/*
  // Alternative solution traversing the list from the beginning

  public int removeVariety(String cookieVar)
  {
    int total = 0;
    int i = 0;
    while (i < orders.size())
    {
      CookieOrder o = orders.get(i);
      if (o.getVariety().equals(cookieVar))
      {
        total += o.getNumBoxes();
        orders.remove(i);
      }
      else
        i++;
    }
    return total;
  }
*/

/*
  // Alternative solution with an iterator
  //   (not in the AP subset)

  public int removeVariety(String cookieVar)
  {
    int total = 0;
    Iterator<CookieOrder> iter = orders.iterator();

    while (iter.hasNext())
    {
      CookieOrder o = iter.next();
      if (o.getVariety().equals(cookieVar))
      {
        total += o.getNumBoxes();
        iter.remove();
      }
    }
    return total;
  }
*/

  public static void main(String[] args)
  {
    MasterOrder goodies = new MasterOrder();
    goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
    goodies.addOrder(new CookieOrder("Shortbread", 5));
    goodies.addOrder(new CookieOrder("Macaroon", 2));
    goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
    System.out.println(goodies.orders);
    System.out.println("Total: " + goodies.getTotalBoxes());
    System.out.println(goodies.removeVariety("Chocolate Chip"));
    System.out.println(goodies.orders);
    System.out.println(" Total: " + goodies.getTotalBoxes());
    System.out.println(goodies.removeVariety("Brownie"));
    System.out.println(goodies.orders);
    System.out.println("Total: " + goodies.getTotalBoxes());
  }
}