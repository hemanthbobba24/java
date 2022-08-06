import java.util.*;
class StarPatterns5{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		for(int i=0;i<=number;i++){
			for(int j=number-1;j>=i;j--){
				System.out.print(" ");
			}
             for(int k=1;k<=i;k++){
             	System.out.print("*");
             }
             System.out.println();
		}
	}
}