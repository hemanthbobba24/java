//5.c
class Studen{
String str;
double credit,points;
Studen(String s,int c,int p){
str=s;
credit=c;
points=p;
}
void mean(){
double a = points/credit;
System.out.println("The Student of Id " + str + " has " + credit + " credits with " +
points + " points with average " + a + ".");
}
}
public class ShowStudent2{
public static void main(String[] args) {
Studen st = new Studen("9999",3,12);
st.mean();
}
}
