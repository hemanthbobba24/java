import java.util.*;
class BookArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Book arr[]=new Book[10];
for(int i=0;i<5;i++){ 
String title="a fictional book vol."+(i+1);arr[i]=new Fiction(title);
}
for (int i=5;i<10;i++){
String title="a non fictiona book vol."+(i-4);
arr[i]=new Fiction(title);
}
for(int i=0;i<10;i++){
System.out.println(arr[i].gettitle());
System.out.println(arr[i].getprice()+"\n");
}
}
}