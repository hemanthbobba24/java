import java.util.*;
class StarPatterns7{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int number=s.nextInt();
		for(int i=1;i<=number;i++){
			for(int j=1;j<=number-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}