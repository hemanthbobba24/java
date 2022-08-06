//3
import java.util.Scanner;
public class Paint
{
public static void main(String[] args)
{
int len, wid, hei, numberOfDoors, numberOfWindows;
Scanner console = new Scanner(System.in);
System.out.print("Enter length: ");
len = console.nextInt();
System.out.print("Enter width: ");
wid = console.nextInt();
System.out.print("Enter height: ");
hei = console.nextInt();
System.out.print("Enter number of doors: ");
numberOfDoors = console.nextInt();
numberOfWindows = console.nextInt();
int totalSurfaceArea = 2 * (len * wid + len
* hei + wid * hei);
int areaOfFloor = len * wid;
int areaOfDoors = 20 * numberOfDoors;
int areaOfWindows = 15 * numberOfWindows;
int totalPaintArea = totalSurfaceArea - areaOfFloor
- areaOfDoors - areaOfWindows;
int requiredPaint = totalPaintArea / 350;
System.out.println("Paint required "
+ requiredPaint + " gallons.");
}
}