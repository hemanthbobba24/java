//1.b
import java.util.*;
public class Percentages2
{
public static void computePercent(double x,double y)
{
double z = (x/y)*100;
System.out.println("Percentage = " + z + "%");
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double a, b;
System.out.println("Enter a number :");
a = sc.nextDouble();
System.out.println("Enter a number :");
b = sc.nextDouble();
computePercent(a,b);
computePercent(b,a);
}
}