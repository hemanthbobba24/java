import java.util.*;
class Ticket{
	public static void main(String[]args)
	{
		double cost=750;
		double tax=5;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of family members:");
		int number=s.nextInt();
		double amount=(cost*number);
       if(amount<2000)
       {
         double totalamount=(amount-(amount)*(5/100))+(cost*number)*(tax/100);
         System.out.println("amount to be paid "+totalamount); 
       }
        else
        {
        	double totalamount=(amount-(amount)*(10/100))+(cost*number)*(tax/100);
        	System.out.println("amount to be paid "+totalamount);
        }
	}
}