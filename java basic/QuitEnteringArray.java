import java.util.*;
class QuitEnteringArray
{
	public static void main(String[]args)
	{
		double value;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ener the size of the array");
		try{
		int size=sc.nextInt();
		
		double A[]=new double[size];
		for(int i=0;i<A.length;i++)
		{
			System.out.print("enter the value "+(i+1)+":");
			value=sc.nextDouble();
           if(value==9999)
           {
           	break;
           }
            else
            {
            	A[i]=value;
            	count++;
            	
            }

		}
		if(count==0)
		{
			System.out.println("please enter the values");
		}
		else{
		System.out.println("the array is");
		for(int j=0;j<count;j++)
		{
			System.out.println(A[j]);
		}
		}
		}
	catch(NegativeArraySizeException e)
	{
		System.out.println("please enter the positive number");
	}
	 catch(ArrayIndexOutOfBoundsException e)
	 {
	 	System.out.println("error:your array is out of bound");
	 }
	 catch(InputMismatchException e)
	 {
	 	System.out.println("please enter the integer values");
	 }
	}
}