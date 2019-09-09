import java.util.ArrayList;

public class Trip
{
  private ArrayList<Flight> flights;
    // stores the flights (if any) in chronological order

  public Trip() { flights = new ArrayList<Flight>(); }

  public void add(Flight f) { flights.add(f); }

  /*** Part (a) ***/

  /** @return the number of minutes from the departure of the first flight to the arrival
   *          of the last flight if there are one or more flights in the trip;
   *          0, if there are no flights in the trip
   */
  public int getDuration()
  {
    if (flights.size() > 0)
    {
      Time start = flights.get(0).getDepartureTime();
      Time end =  flights.get(flights.size() - 1).getArrivalTime();
      return start.minutesUntil(end);   // No need to loop through all flights
    }
    else
      return 0;
  }

  /*** Part (b) ***/

  /** Precondition: the departure time for each flight is later than the arrival time of its
   *                preceding flight
   *  @return the smallest number of minutes between the arrival of a flight and the departure
   *          of the flight immediately after it, if there are two or more flights in the trip;
   *          -1, if there are fewer than two flights in the trip
   */
  public int getShortestLayover()
  {
    if (flights.size() < 2)
      return -1;
    int shortest = 24 * 60;  // minutes in a day -- the greatest possible value
    for (int i = 1; i < flights.size(); i++)
    {
      Time arrival = flights.get(i - 1).getArrivalTime();
      Time departure = flights.get(i).getDepartureTime();
      int mins = arrival.minutesUntil(departure);
      if (mins < shortest)
        shortest = mins;
    }
    return shortest;
  }
}
