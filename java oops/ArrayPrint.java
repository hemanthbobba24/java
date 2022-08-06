import java.util.*;
class ArrayPrint{
public static <E>void printArray(E[] inputArray){
for(E element:inputArray){
System.out.println(" "+element);
}
System.out.println();
}
public static void main(String args[]){
Integer [] intArray={1,2,3,4,5};
String [] StrArray={"sri","ram","hemanth","hi","raju"};
System.out.println("integer Array is : ");
printArray(intArray);
System.out.println("String Array is : ");
printArray(StrArray);
}
}
