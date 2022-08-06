import java.util.*;
class Calculator{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		double result;
		System.out.println("i");
		double i=s.nextInt();
		System.out.println("j");
		double j=s.nextInt();
		System.out.println("select any one of the following ");
		System.out.println("+,-,*,/");
		String str=s.next();
		switch(str){
			case "+":
			result=i+j;
			System.out.println(result);
			break;
			case "-":
			result=i-j;
			System.out.println(result);
			break;
			case "*":
			result=i*j;
			System.out.println(result);
			break;
			case "/":
			result=i/j;
			System.out.println(result);
			break;
			default:
			System.out.println("invalid");
		}
	}
}