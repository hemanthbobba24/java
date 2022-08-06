import java.util.*;
public class QuartsToGallonsWithExceptionHandling {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 try{
 final int NUMBER_OF_QUARTS = 4;
 double quarts;
 System.out.println("1How many quarts of paint is needed for the painting job?");

 quarts = sc.nextDouble();

 double gallons = quarts / NUMBER_OF_QUARTS;

 System.out.println(quarts+" quarts or "+gallons+ " gallons of paint is required for painting job ");

 }
 catch(InputMismatchException c){
 System.out.println("Given Input is not a Number.");
 }
 }
}