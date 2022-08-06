import java.util.*;
//Studentstack.java
class Studentstack{
String nm;
String id;
Studentstack(String nm,String id){
this.nm=nm;
this.id=id;
}
public String getname(){
return nm;
}
public String getid(){
return id;
}
public String toString(){
return(" Student name " +getname()+" Student id " +getid());
}
}
//GenericStackDemo.java

class GenericStack<T>{
int t;
int m;
T[] arr;
GenericStack(){
int n=4;
arr=(T[]) new Object[n];
m=n;
t=-1;
}
void push(T e){
if(t==(m-1)){
System.out.println("full");
}
else{
t++;
arr[t]=e;
}
}
T pop(){
if (t == -1) {
System.out.println("empty");
return null;
}
else{
return arr[t--];
}
}
void print(){
for(int i=t;i>=0;i--){
System.out.println(arr[i]+" ");
}
System.out.println();
}
}
class GenericStackDemo{
public static void main(String[] args){
GenericStack<Studentstack> obj1=new
GenericStack<Studentstack>();
GenericStack<String> obj2=new GenericStack<String>();
Studentstack obj3=new Studentstack("sumanth","19bce7117");
Studentstack obj4=new Studentstack("rajesh","19bce7772");
Studentstack obj5=new Studentstack("varun","19bce7234");
Studentstack obj6=new Studentstack("Sriram","19bci7111");
obj1.push(obj3);
obj1.push(obj4);
obj1.push(obj5);
obj1.push(obj6);
obj1.print();
obj1.pop();
System.out.println("After removing element from array");
obj1.print();
obj2.push("sumanth");
obj2.push("rajesh");
obj2.push("varun");
obj2.push("sriram");
obj2.print();
obj2.pop();
System.out.println("After removing element from array");
obj2.print();
}
}