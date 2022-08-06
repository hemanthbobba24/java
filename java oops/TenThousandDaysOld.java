import java.util.*;
import java.time.*;
class TenThousandDaysOld{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Date of Birth:");
 System.out.print("Day:");int day=sc.nextInt();
 System.out.print("month:");int month=sc.nextInt();
 System.out.print("year:");int year=sc.nextInt();
 LocalDate birth=LocalDate.of(year, month,day);
 LocalDate result=birth.plusDays(10000);
 System.out.print("the day when you become 10000 years old is "+result);
 }
}