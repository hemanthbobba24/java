 import java.util.*;
public class JobPricing{
 public double computePrice(int wh, int th,int cost){
 return cost+(35*wh)+(12*th);
 }
 public static void main(String[] args){
 JobPricing pc=new JobPricing();
 Scanner s=new Scanner(System.in);
 System.out.println("Enter name:");
 String name=s.nextLine();
 System.out.println(name);
 System.out.println("cost of material:");
 int cost=s.nextInt();
 System.out.println(cost);
 System.out.println("number of hrs");
 int wh=s.nextInt();
 System.out.println(wh);
 System.out.println("travelling time in hrs");
 int th=s.nextInt();
 System.out.println(th);
 System.out.println("Extimited price for"+ " "+"name"+ " "+"is"
+pc.computePrice(wh,th,cost));
 }
}
