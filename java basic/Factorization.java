import java.util.*;
class Factorization{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		double a=s.nextDouble();
		double k=1;
		for(int i=1;i<=a;i++){
			k=k*i;
		}
		System.out.println("factorial of the number is:"+k);
	}
}