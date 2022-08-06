//2
import java.util.Scanner;
public class InchConversion
{
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
int inches= sc.nextInt();
convertToFeet(inches);
convertToYards(inches);
}
public static void convertToFeet(int inches)
{
System.out.println("One Feet equals 12 inches");
double inch=inches;
System.out.println("So,"+inches+" inches equals "+inch/12+" feet");
}
public static void convertToYards(int inches)
{
System.out.println("One Yard equals 3 feets or 36 inches");
double inch=inches;
System.out.println("So,"+inches+" inches equals "+inch/36+" yards");
}
}