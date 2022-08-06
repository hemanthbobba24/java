 import java.util.*;
public class Billing{
 double totaldue;
 public double computeBill(double price){
 totaldue=price+(0.08*price);
 return totaldue;
 }
 public double computeBill(double price, int quantity){
 totaldue=(price*quantity)+(0.08*price*quantity);
 return totaldue;
 }
 public double computeBill(double price, int quantity, double couponvalue){
 totaldue=(price*quantity)-couponvalue;
 totaldue=totaldue+(0.08*totaldue);
 return totaldue;
 }
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 Billing obj1=new Billing();
 Billing obj2=new Billing();
 Billing obj3=new Billing();
 System.out.println("totaldue:"+obj1.computeBill(100.0));
 System.out.println("totaldue:"+obj2.computeBill(100.0,3));
 System.out.println("totaldue:"+obj3.computeBill(100.0,3,50.0));
 }
}