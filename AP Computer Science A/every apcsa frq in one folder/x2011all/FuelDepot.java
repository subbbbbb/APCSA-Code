package x2011all;

import java.util.List;
import java.util.ArrayList;

public class FuelDepot
{
  /** The robot used to move the filling mechanism */
  private FuelRobot filler;

  /** The list of fuel tanks */
  private List<FuelTank> tanks;

  public FuelDepot(FuelRobot r, List<FuelTank> lst)
  {
    filler = r;
    tanks = new ArrayList<FuelTank>();
    for (FuelTank t : lst)
      tanks.add(t);
  }

  // Part (a)

  /** Determines and returns the index of the next tank to be filled.
   *  @param threshold fuel tanks with a fuel level <= threshold may be filled
   *  @return index of the location of the next tank to be filled
   *  Postcondition: the state of the robot has not changed
   */
  public int nextTankToFill(int threshold)
  {
    int iMin = filler.getCurrentIndex();

    for (int i = 0; i < tanks.size(); i++)
      if (tanks.get(i).getFuelLevel() <= threshold &&
                tanks.get(i).getFuelLevel() < tanks.get(iMin).getFuelLevel())
        iMin = i;

    return iMin;
  }

  // Part (b)

  /** Moves the robot to location locIndex.
   *  @param locIndex the index of the location of the tank to move to
   *         Precondition: 0 <= locIndex < tanks.size()
   *  Postcondition: the current location of the robot is locIndex
   */
  public void moveToLocation(int locIndex)
  {
    int index = filler.getCurrentIndex();
    if (locIndex > index)
    {
      if (!filler.isFacingRight())
        filler.changeDirection();
      filler.moveForward(locIndex - index);
    }
    else if (locIndex < index)
    {
      if (filler.isFacingRight())
        filler.changeDirection();
      filler.moveForward(index - locIndex);
    }
  }
}
