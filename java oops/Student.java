//5.a
public class Student{
public static void main(String[] args) {
setId("19BCE7646");
setCredit(23);
setPoints(214);
average();
}
static String str; 
static double
credit,points;
static void setId(String s){
str=s;
}
static void setCredit(int c){
credit=c;
}
static void setPoints(int p){
points=p;
}
static void average(){
double a = points/credit;
System.out.println("The Student of Id " + str + " has " + credit + " credits with " +
points + " points with average " + a + ".");
}
}