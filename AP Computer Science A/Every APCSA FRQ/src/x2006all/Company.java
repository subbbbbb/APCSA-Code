package x2006all;

public class Company
{
  /*** Part (b) ***/

  // fills result with customers merged from the
  // beginning of list1 and list2;
  // result contains no duplicates and is sorted in
  // ascending order by customer
  // precondition:  result.length > 0;
  //                list1.length >= result.length;
  //                list1 contains no duplicates;
  //                list2.length >= result.length;
  //                list2 contains no duplicates;
  //                list1 and list2 are sorted in
  //                ascending order by customer
  // postcondition: list1, list2 are not modified
  public static void prefixMerge(Customer[] list1,
                                 Customer[] list2,
                                 Customer[] result)
  {
    int i = 0, j = 0;

    for (int k = 0; k < result.length; k++)
    {
      Customer c1 = list1[i];
      Customer c2 = list2[j];
      int diff = c1.compareCustomer(c2);

      if (diff < 0)
      {
        result[k] = c1;
        i++;
      }
      else if (diff > 0)
      {
        result[k] = c2;
        j++;
      }
      else
      {
        result[k] = c1;
        i++;
        j++;
      }
    }
  }
}
