import java.util.*;
interface GenericStackable<T>{
public void push(T e);
public T pop();
public void print();
public boolean isEmpty();
}
class GenericStack<T>implements GenericStackable<T>{
int t;
int m;
T[] arr;
GenericStack(){
int n=4;
arr=(T[]) new Object[n];
m=n;
t=-1;
}
public void push(T e){
if(t==(m-1)){
System.out.println("full");
}
else{
t++;
arr[t]=e;
}
}
public T pop(){
if (t == -1) {
System.out.println("empty");
return null;
}
else{
return arr[t--];
}
}
public void print(){
for(int i=t;i>=0;i--){
System.out.print(arr[i]+" ");
}
System.out.println();
}
public boolean isEmpty(){
if(t==-1){
return true;
}
else{
return false;
}
}
}
class GenericStackDemo2{
public static void main(String[] args){
GenericStack<Integer> obj1=new GenericStack<Integer>();
GenericStack<String> obj2=new GenericStack<String>();
obj1.push(131);
obj1.push(15);
obj1.push(9);
obj1.push(75);
obj1.print();
obj1.pop();
System.out.println("After removing element from array");
obj1.print();
obj2.push("sumanth");
obj2.push("raju");
obj2.push("varun");
obj2.push("sriram");
obj2.print();
obj2.pop();
System.out.println("After removing element from array");
obj2.print();
}
}