import java.util.*;
class UseInputArray{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int length=sc.nextInt();
		String s[]=new String[length];
		for(int i=0;i<length;i++){
            System.out.println("enter the string");
            s[i]=sc.next();

		}
		System.out.println("your string array is");
		for(int j=0;j<length;j++){
			System.out.println(s[j]);
		}
	}
}
