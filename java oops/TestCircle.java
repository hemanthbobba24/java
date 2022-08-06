import java.util.*;
class TestCircle extends Circle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Circle obj1=new Circle();
Circle obj2=new Circle();
Circle obj3=new Circle();
obj1.setRadius(10);
obj2.setRadius(1000);
System.out.println("Radius:"+obj1.radius);
System.out.println("Diameter:"+obj1.diameter);
System.out.println("area:"+obj1.area);
System.out.println("Radius:"+obj2.radius);
System.out.println("Diameter:"+obj2.diameter);
System.out.println("area:"+obj2.area);
System.out.println("Radius:"+obj3.radius);
System.out.println("Diameter:"+obj3.diameter);
System.out.println("area:"+obj3.area);
}
}