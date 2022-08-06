import java.util.Scanner;
public class DistanceFromAverage
{
public static void main(String[] args)
{
double[] input = new double[15];
int exit = 99999;
double value;
double total =0;
int counter =0;
boolean repeat=true;
Scanner sc = new Scanner(System.in);
for (int i = 0; i < input.length && repeat; i++) {
System.out.print("Enter a value(99999 to exit):");
value = sc.nextDouble();
if (value == exit) {
repeat=false;
} else {
input[i] = value;
total += input[i];
counter++;
}
}
double average= total/counter;
if (counter == 0)
System.out.println("Error! Please enter any values");
else {
System.out.printf("%-10s%-20s\n","value","Distance from average");
for (int a = 0; a < counter; a++) {
System.out.printf("%-10.2f%-10.2f\n",input[a],average-input[a]);
}
}
}
}