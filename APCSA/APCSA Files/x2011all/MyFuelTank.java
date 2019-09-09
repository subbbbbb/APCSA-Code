package x2011all;

public class MyFuelTank implements FuelTank
{
  private int level;
  
  public MyFuelTank(int level) { this.level = level; }  
  public int getFuelLevel() { return level; }
}
