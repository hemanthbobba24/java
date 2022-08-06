import java.util.*;
public class QuartsToGallons {
public static void main(String[] args) {
final double NUMBER_OF_QUARTS = 4;
double quarts;
Scanner sc = new Scanner(System.in);
System.out.println("How many quarts of paint is needed for the painting job?");

quarts = sc.nextDouble();
double gallons = quarts / NUMBER_OF_QUARTS;
double quarts1 = quarts % NUMBER_OF_QUARTS;
System.out.println("A painting job that needs to use " + quarts + " quarts requires " + gallons + " gallons and " + quarts1 + " quarts of paint.");


}
}