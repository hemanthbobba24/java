//1.a
public class Percentages
{
public static void computePercent(double x,double y)
{
double z = (x/y)*100;
System.out.println("Percentage = " + z + "%");
}
public static void main(String[] args)
{
double a =2.0 , b = 5.0;
computePercent(a,b);
computePercent(b,a);
}
}