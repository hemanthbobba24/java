import java.util.*;
class StarPatterns4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++){
			for(int j=number-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=number;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=number-1;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}