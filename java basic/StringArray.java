import java.util.*;
class StringArray
{
	public static void main(String[]args)
	{
		Scanner scam=new Scanner(System.in);
		System.out.print("enter the number of villages:");
		int size=scam.nextInt();
		String s[]=new String[size];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter the village "+(i+1));
			s[i]=scam.next();
		}
		System.out.print("so villages in your locality are:");
		for(int j=0;j<s.length;j++)
		{
			System.out.print(","+s[j]);
		}

	}
}