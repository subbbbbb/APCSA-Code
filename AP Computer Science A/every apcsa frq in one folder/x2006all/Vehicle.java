package x2006all;

/*** Part (b) ***/

public class Vehicle extends TaxableItem
{
  private double dealerCost;
  private double dealerMarkup;

  public Vehicle(double cost, double markup, double rate)
  {
    super(rate);
    dealerCost = cost;
    dealerMarkup = markup;
  }

  public double getListPrice()
  {
    return dealerCost + dealerMarkup;
  }

  public void changeMarkup(double markup)
  {
    dealerMarkup = markup;
  }
}
