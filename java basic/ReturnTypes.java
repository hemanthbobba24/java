import java.util.*;
class Main
{
	int i=2;
	int j=8;
	double sum=0;
	public String sum()
	{
		 return "the sum is "+(sum=i+j);
		
	

	}
	 public void sub() 
	 {
	 	double sub=sum+sum;
	 	System.out.println("sub is "+sub);
	 }
}
class ReturnTypes
{
	public static void main(String[]args)
	{
		Main m=new Main();
		m.sum();
		m.sub();
	}
}