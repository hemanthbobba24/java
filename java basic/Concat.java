import java.util.*;
class Concat
{
	public static void main(String[]args)
	{
		String str="hello";
		String k="hey";
		int a=15;
		System.out.println(str.concat(k));
		System.out.println(String.valueOf(a)+10);
		System.out.println(str.concat(String.valueOf(a)));
	}
}