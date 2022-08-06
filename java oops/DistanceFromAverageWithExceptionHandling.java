import java.util.*;
public class DistanceFromAverageWithExceptionHandling
{
public static void main(String[] args)
{
try{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array Size : ");
int n = sc.nextInt();
int[] a = new int[n];
int exit = 99999;
int value;
int total =0;
int counter =0;
boolean repeat=true;
for (int i = 0; i < a.length && repeat; i++) {
System.out.print("Enter a value(99999 to exit):");
value = sc.nextInt();
if (value == exit) {
repeat=false;
} else {
a[i] = value;
total += a[i];
counter++;
}
}
int average= total/counter;
if (counter == 0)
System.out.println("Error! Please enter any values");
else {
System.out.printf("%-10s%-20s\n","value","Distance from average");
for (int j = 0; j < counter; j++) {
System.out.printf("%-10.2f%-10.2f\n",a[j],average-a[j]);
}
}
}
catch(InputMismatchException c){
System.out.println("Non Integer Input.");
}
catch(NegativeArraySizeException d){
System.out.println("Negative Integer");
}
}
}