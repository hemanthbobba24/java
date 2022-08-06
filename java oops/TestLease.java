//6.b
import java.util.*;
class TestLease extends Lease
{
public static void main (String args[])
{
Lease lease1 = getData();
showValues(lease1);
Lease lease2 = getData();
showValues(lease2);
lease2.addPetFee();
showValues(lease2);
Lease lease3 = getData();
showValues(lease3);
lease3.addPetFee();
showValues(lease3);
System.out.println("Sample:");
Lease lease4 = new Lease();
showValues(lease4);
}
public static void showValues(Lease ls)
{
System.out.println("Name : " + ls.getAptTenName());
System.out.println("Apt_Num : " + ls.getApt_Num());
System.out.println("Rent : " + ls.getRent()+ "$");
System.out.println("Term : " + ls.getTerm());
}
public static Lease getData()
{
Lease a = new Lease();
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String Name = sc.nextLine();
a.setName(Name);
System.out.println("Enter your apartment number:");
int Apt_Num = sc.nextInt();
a.setApt_Num(Apt_Num);
System.out.println("Enter your monthly rent amount:");
double Rent = sc.nextDouble();
a.setRent(Rent);
System.out.println("Enter the term of your lease in months:");
int Term = sc.nextInt();
a.setTerm(Term);
return a;
}
}