import java.util.*;
class SumArray{
	public static void main(String[]args){
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int length=s.nextInt();
		int A[]=new int[length];
		for(int i=0;i<length;i++){
			System.out.println("enter the number");
           A[i]=s.nextInt();
		}
		
		for(int j=0;j<length;j++){
           sum=sum+A[j];
		}
		System.out.println("sum is"+sum);
	}

}