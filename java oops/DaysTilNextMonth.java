import java.util.*;
import java.time.*;
class DaysTilNextMonth{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.print("day:");int day=sc.nextInt();
 System.out.print("month:");int month=sc.nextInt();
 System.out.print("year:");int year=sc.nextInt();
 LocalDate d1=LocalDate.of(year,month,day);
 int daysleft=d1.lengthOfMonth()-day;
 System.out.print("Days till next month:"+daysleft);
 }
}