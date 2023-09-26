// create an integer array of positive no. and count the even and odd no.
import java.util.*;
public class oddeven
{
  public static void main (String[]args)
  {
    int s = 0, l = 0;
    int a[] = { 12, 45, 67, 34 };
    for (int i = 0; i < 4; i++)
      {
	if (a[i] % 2 == 0)
	  {
	    s += 1;
	  }
	else
	  {
	    l += 1;
	  }
      }
    System.out.println ("No. of odd no. =" + s);
    System.out.println ("No. of even no. =" + l);
  }
}
