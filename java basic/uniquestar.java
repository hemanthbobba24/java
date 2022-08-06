import java.util.*;
class UniqueStar{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		int num=scan.nextInt();
        for(int i=1;i<=num;i++){
        	for(int j=1;j<=i;j++){
        		if(j==1){
        		System.out.print("*");
        	}
        	else{
        		System.out.print(" *");
        	}
        	}
        	System.out.println();
        }
	}
}