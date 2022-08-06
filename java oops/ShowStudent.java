//5.b
public class ShowStudent
{
public static void main(String args[])
{
ShowStudent s1 = new ShowStudent ();
s1.setcredits(4);
s1.setID(45);
s1.setpoints(14);
double gpa = s1.gpa(s1.getpoints(),s1.getcredits());
s1.printmessage();
}
}
