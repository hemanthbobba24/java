import java.util.*;
public class Circle{
double radius;
 double diameter;
 double area;
 Circle(){
 radius=1;
 diameter=radius*2;
 area=Math.PI*radius*radius;
 }
 public void setRadius(double radius){
 this.radius=radius;
 diameter=radius*2;
 area=Math.PI*radius*radius;
 }
 public double getRadius(){return radius;}
 public double getdiameter(){return diameter;}
 public double getarea(){return area;}
}
