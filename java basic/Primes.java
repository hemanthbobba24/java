import java.util.*;
class Primes{
	public static void main(String[]args){
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  int num=sc.nextInt();
		  System.out.println("so the primes are");
		  for(int i=1;i<=num;i++)
		  {
		  	int temp=0;
            for(int j=2;j<=i-1;j++)
            {
            	if(i%j==0)
            	{
            		temp=temp+1;
            	}
            }
            if(temp==0)
            {
            	System.out.println(i);
            }
		  }
		}
	}