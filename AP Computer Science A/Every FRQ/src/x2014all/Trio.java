package x2014all;

import java.text.DecimalFormat;

public class Trio implements MenuItem
{
  private Sandwich sandwich;
  private Salad salad;
  private Drink drink;
  
  public Trio(Sandwich aSandwich, Salad aSalad, Drink aDrink)
  {
    sandwich = aSandwich;
    salad = aSalad;
    drink = aDrink;
  }
  
  public String getName()
  {
    return sandwich.getName() + "/" + salad.getName() +
                                "/" + drink.getName() + " Trio";
  }
  
  public double getPrice()
  {
    double price1 = sandwich.getPrice();
    double price2 = salad.getPrice();
    double price3 = drink.getPrice();
    double smallest = Math.min(Math.min(price1, price2), price3);
    return price1 + price2 + price3 - smallest;
  }

  public String toString ()
  {
    DecimalFormat money = new DecimalFormat("0.00");
    return getName() + " " + money.format(getPrice());
  }  
}
