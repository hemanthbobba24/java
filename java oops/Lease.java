//6.a
import java.util.*;
public class Lease
{
	public static void main(String[]args){
	 String aptTenName;
 int aptNum;
 double monRent;
 int terOfLease;
  double PET_FEE = 10.0;
}
public Lease()
{
aptTenName = "XXX";
aptNum = 0;
monRent = 1000;
terOfLease = 12;
}
public void setName(String a)
{
aptTenName = a;
}
public void setApt_Num(int apt)
{
aptNum = apt;
}
public void setRent(double r)
{
monRent = r;
}
public void setTerm(int l)
{
terOfLease = l;
}
public String getAptTenName()
{
return aptTenName;
}
public int getApt_Num()
{
return aptNum;
}
public double getRent()
{
return monRent;
}
public int getTerm()
{
return terOfLease;
}
public double addPetFee()
{
monRent = this.monRent + this.PET_FEE;
explainPetPolicy();
return monRent;
}
public static void explainPetPolicy()
{
System.out.println("$10 more for having a pet");
}
}
