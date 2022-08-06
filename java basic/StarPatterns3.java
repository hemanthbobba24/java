import java.util.*;
class StarPatterns3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=number;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}