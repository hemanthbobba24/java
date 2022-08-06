import java.util.*;
class Trendy
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=100 && num<=999)
			{
              num=num/10;
              num=num%10;
             if(num%3==0)
             {
             	System.out.println("Trendy Number");
             }
             else{
             	System.out.println("Not a Trendy Number");
             }
			}
        else{
        	System.out.println("Not a Trendy Number");
        }
	}
}