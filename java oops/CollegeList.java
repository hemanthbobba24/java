import java.util.*;
public class Person
{
private String firstName;
private String lastName;
private String address;
private String zip;
private String phone;
public Person ()
{
setData ();
}
public void setData ()
{
Scanner scan = new Scanner (System.in);
System.out.print ("Enter the Person's First Name : "); 
this.firstName =scan.nextLine ();
System.out.print ("Enter the Person's Last Name : "); 
this.lastName =scan.nextLine ();
System.out.print ("Enter the Person's address : ");
this.address = scan.nextLine ();
System.out.print ("Enter the Person's Zipcode : ");
this.zip = scan.nextLine (); 
System.out.print ("Enter the Person's Phone : ");
this.phone = scan.nextLine ();
}
public String display ()
{
return firstName + " " + lastName + " " + address + " " + zip + " " + phone;
}
}

public class CollegeEmployee extends Person
{
private String ssn;
  private double salary; 
private String department; 
public CollegeEmployee ()
{
}
@Override 
public void setData ()
{
super.setData ();
Scanner scan = new Scanner(System.in);
 System.out.print ("EnterSSN: ");
 this.ssn = scan.nextLine ();
System.out.print ("Enter Salary: ");
this.salary = scan.nextDouble ();
scan.nextLine ();
System.out.print ("Department : ");
this.department = scan.nextLine (); 
} 
@Override
public String display ()
{
return super.display () + "\n" + "SSN: " + ssn + "Salary $ :" + salary + "Department : " + department;

}
}

 public class Faculty extends CollegeEmployee
{
private boolean isTenured;
public Faculty ()
{
}
@Override 
public void setData ()
{
super.setData ();
Scanner scan = new Scanner (System.in);
System.out.print ("Faculty memeber is: ");
this.isTenured = scan.nextBoolean ();
}
@Override
public String display ()
{
if (isTenured)
{
return super.display () + " Faculty member is tenured";
}
else 
{
return super.display () + " Faculty member is not tenured"; 
}
}
}
  
public class Student extends Person
{
private String major;
private double gpa;
public Student ()
{
}
@Override
 public void setData ()
{
super.setData ();
Scanner scan = new Scanner (System.in);
System.out.print ("Enter the Student's major : ");
this.major = scan.nextLine ();
System.out.print ("Enter Student's GPA: ");
this.gpa = scan.nextDouble ();
scan.nextLine ();
}
@Override
public String display ()
{
return super.display () + "\n" + "Major : " + major + "GPA: " + gpa; }
} 
  import java.util.*;
public class CollegeList
{
public static void main (String[]args)
{
Scanner scan = new Scanner (System.in); Person[] persons = new Person[14];
String choice;
int i = 0;
do
{
menu ();
System.out.println ("Enter the choice: "); choice = scan.nextLine();
 switch (choice.toUpperCase ().charAt (0)) 
{
 case 'C':
persons[i] = new CollegeEmployee ();
 i++;
 break;
 case 'F':
persons[i] = new Faculty (); 
i++;
 break; 
case 'S':
persons[i] =new Student ();
 i++; 
break;
 case 'Q':
try
{
for (Person person:persons)
{
System.out.println (person.display ());
System.out.println ();
}
}
catch (Exception e)
{
}
break;
default:
System.out.println ("Invalid choice! try again ");
 break; 
}
}
while (choice.toUpperCase ().charAt (0) != 'Q');
 }
public static void menu ()
{
System.out.println ("C)ollege Employee.\n" + "F)aculty.\n" + "S)tudent.\n" +"Q)uit.");

}
} 