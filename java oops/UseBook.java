import java.util.*;
abstract class Book{
String title;
double price;
Book(String title){
this.title=title;
}
public String gettitle(){return title;} 
public double getprice(){return price;}
abstract void setPrice();
}
class Fiction extends Book{
public void setPrice(){
price=24.99;
}
Fiction(String title){
super(title);
setPrice();
}
}
class nonFiction extends Book{
public void setPrice(){price=37.99;}nonFiction(String title){
super(title);
setPrice();
}
}

class UseBook{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Fiction obj1=new Fiction("A fictional book."); 
nonFiction obj2=new nonFiction("A non fictional book.");
System.out.println(obj1.gettitle());
System.out.println(obj1.getprice());
System.out.println(obj2.gettitle());
System.out.println(obj2.getprice());
}
}