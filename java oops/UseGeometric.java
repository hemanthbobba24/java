
import java.util.Scanner;
class GeometricFigure {
String figureType,height, width;
int area;
Scanner sc = new Scanner(System.in);
public GeometricFigure(){
System.out.println("Enter height:");
height=sc.nextLine();
System.out.println("Enter width:");
width=sc.nextLine();
getArea(height, width);
}
public void getArea(String height,String width){
}
}


class Square extends GeometricFigure{
public Square() {
super();
this.figureType="Square";
getArea(height, width);
display();
}
public void getArea(String height,String width){
int h = Integer.parseInt(height);
int w = Integer.parseInt(width);
area=h*w;
}
public void display(){
System.out.println(this.figureType + " Area:"+ area);
}
}

class Triangle extends GeometricFigure {
public Triangle() {
super();
this.figureType="Triangle";
getArea(height, width);
display();
}
public void getArea(String height, String width){
int h = Integer.parseInt(height);
int w = Integer.parseInt(width);
area=(h*w)/2;
}
public void display(){
System.out.println(this.figureType + " Area:"+ area);
}
}

class UseGeometric {
public static void main(String[] args) {
GeometricFigure[] geometricShapes = new GeometricFigure[2];
geometricShapes[0] = new Square();
geometricShapes[1] = new Triangle();
}
}