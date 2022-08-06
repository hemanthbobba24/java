import java.util.*;
class GenericLinearSearch{
static<T extends Comparable<T>,V extends T >boolean Isin(T x ,V[] y){
for(int i=0;i<y.length;i++)
if(x.equals(y[i]))
return true;
return false;
}
public static void main(String[] args) {
Integer nums[]= {1,2,3,4,5};
if(Isin(2,nums))
System.out.println("2 is in nums");
if(!Isin(7,nums))
System.out.println("7 is not in nums");
}
}
