import java.util.*;
abstract class PhoneCall{
String phonenumber;
double price;
PhoneCall(String phonenumber){
this.phonenumber=phonenumber;
this.price=0.0;
}
public void setPrice(double price){
this.price=price;
}
abstract String getphonenumber();
abstract double getprice();
abstract void display(); 
}
class incomingCall extends PhoneCall{
incomingCall(String phonenumber){super(phonenumber);
setPrice(0.02);
}
String getphonenumber(){return phonenumber;}
double getprice(){return price;}
void display(){
System.out.println("phone number:"+getphonenumber());
System.out.println("rate:"+getprice());
System.out.println("price:"+getprice());
}
}
class Outgoingcall extends PhoneCall{
double time;
Outgoingcall(String phonenumber,double time){
super(phonenumber);
this.price=0.04;
this.time=time;
}
String getphonenumber(){return phonenumber;}
double getprice(){return price;} 
void display(){
System.out.println("phone number:"+getphonenumber());
System.out.println("rate per minute:"+getprice());
System.out.println("time:"+time);
System.out.println("total price:"+getprice()*time);
}
}

class Demophonecalls{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
incomingCall obj1=new incomingCall("8019509951");
Outgoingcall obj2=new Outgoingcall("9951680195",5);
obj1.display();
System.out.println();
obj2.display();
}
}