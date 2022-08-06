 import java.util.*;
 class Prime{
 	public static void main(String[]args){
 		int temp=0;
 		Scanner s=new Scanner(System.in);
 		System.out.println("enter the number");
 		int number=s.nextInt();
 		for(int i=2;i<number;i++){
 		  if(number%i==0){
             temp=temp+1;
 		  }
 		}
 		  if(temp>0){
 		  	System.out.println("it is a not prime number");
 		  }
 		  else{
 		  	System.out.println("it is a prime number");
 		  }
 		
 	}
 }