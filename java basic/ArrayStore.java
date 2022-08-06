import java.util.*;
class ArrayStore{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int number=sc.nextInt();
		int A[]=new int[number];
		for(int i=0;i<number;i++){
			
			System.out.println("enter the array here"+(i+1));
			A[i]=sc.nextInt();
		}
		System.out.println("the array is ");
		for(int i=0;i<number;i++){
			System.out.println(A[i]);
		}

	}
}