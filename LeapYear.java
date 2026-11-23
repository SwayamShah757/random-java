import java.util.Scanner;

public class LeapYear
{
  private Scanner scan;

  public LeapYear()
  {
    scan = new Scanner (System.in);
  }
  public static void main(String[] args)
  {
    LeapYear ly = new LeapYear();
    ly.leapIt();
  }

  public void leapIt()
  {
    int i = 1;
    while (i>0)
    {
      System.out.print("Enter a Year ");
      i = scan.nextInt();

      if(i % 100 !=0 && i % 4 == 0 || i % 100 == 0 && i % 400 == 0 && i !=0)
      {
        System.out.print("\n" + i + " is a leap year!\n\n");
      }
      else if (i != 0)
      {
        System.out.print("\n" + i + " is NOT a leap year!\n\n");
      }
    }
  }
}
