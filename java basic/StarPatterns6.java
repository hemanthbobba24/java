import java.util.*;
class StarPatterns6{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value ");
		int number=s.nextInt();
		for(int i=1;i<=number;i++){
			for(int j=number-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			for(int q=2;q<=i;q++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}