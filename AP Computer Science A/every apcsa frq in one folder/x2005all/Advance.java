package x2005all;

/*** Part (a) ***/

public class Advance extends Ticket{
  private int daysInAdvance; // the entire premise of the Advance ticket is to see it in advance
  public Advance(int days) 
  {
    daysInAdvance = days;
  }
  public double getPrice() { // double because it is a price
    if (daysInAdvance >= 10) {
      return 30.0; // if it is more than 10 days in advance, the ticket price is $30
    }
    return 40.0; // if it is less than 10 days in advance, ticket price jumps to $40
  }
}

