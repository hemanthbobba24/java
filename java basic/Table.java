import java.util.*;
class Table{
	public static void main(String[]args){
		int ans=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=s.nextInt();
		for(int n=2;n<=num;n++){
		for(int i=1;i<=10;i++){
           ans=n*i;
           System.out.println(n+" * "+i+" = "+ans);
		}
	}
	}
}