import java.util.*;
class StarPatterns2{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
       int number=s.nextInt();
		for(int i=1;i<=number;i++){
			for(int j=number;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}