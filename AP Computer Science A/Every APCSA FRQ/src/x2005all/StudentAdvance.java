package x2005all;

/*** Part (b) ***/

public class StudentAdvance extends Advance
{
  public StudentAdvance(int days)
  {
    super(days); // this was used in order to call parent class Advance constructor and give it a value
  }

  public double getPrice()
  {
    return super.getPrice() / 2; //super. here calls the getPrice from Advance superclass, along with dividing it by 2
  }

  public String toString()
  {
    return super.toString() + " (student ID required)"; // the toString method is required in order to tell the students that they have to have a student ID
  }
}
// 