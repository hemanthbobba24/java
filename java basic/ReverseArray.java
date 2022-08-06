import java.util.*;
class ReverseArray{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.println("enter the array values");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=Math.floorDiv(len,2);
		int temp;
		System.out.println("so the reverse array is:");
           for(int i=0;i<n;i++)
           {
           	temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;

           }
           for(int i=0;i<len;i++){
           	  System.out.println(arr[i]);
           }
          
	}
}