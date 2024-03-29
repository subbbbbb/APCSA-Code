package x2004all;

import java.util.Arrays;

public class Robot
{
  private int[] hall;
  private int pos;
  private boolean facingRight;

  public Robot(int[] toys, int pos, boolean facingRight)
  {
    hall = new int[toys.length];
    for (int i = 0; i < toys.length; i++)
      hall[i] = toys[i];
    this.pos = pos;
    this.facingRight = facingRight;
  }

  // A-4, (a)

  public boolean forwardMoveBlocked()
  {
    return (facingRight && pos == hall.length - 1) ||
                                    (!facingRight && pos == 0);
  }

  // A-4, (b)

  private void move()
  {
    if (hall[pos] > 0)
      hall[pos]--;

    if (hall[pos] == 0)
    {
      if (forwardMoveBlocked())
        facingRight = !facingRight;
      else if (facingRight)
        pos++;
      else
        pos--;
    }
  }

  // A-4, (c)

  public int clearHall()
  {
    int count = 0;
    while (!hallIsClear())
    {
      move();
      count++;
    }
    return count;
  }

  private boolean hallIsClear()
  {
    int count = 0;

    for (int i = 0; i < hall.length; i++)
      count += hall[i];

    return count == 0;
  }

  public static void main(String[] args)
  {
    System.out.println("******* A-4 *******");
    Robot robot = new Robot(new int[] {1,1,2,2}, 1, true);
    System.out.println(robot.clearHall());
  }
}


