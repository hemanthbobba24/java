import java.util.*;
import java.time.*;
class TestMonthHandling{
 public static void main(String args[]){
 LocalDate d1=LocalDate.of(2020,01,31);
 LocalDate d2=LocalDate.of(2020,12,31);
 System.out.println(d1);
 System.out.println(d2);
 System.out.println(d1.plusMonths(1));
 System.out.println(d2.plusMonths(1));
 System.out.println(d1.plusMonths(2));
 System.out.println(d2.plusMonths(2));
 System.out.println(d1.plusMonths(3));
 System.out.println(d2.plusMonths(3));
 }
}