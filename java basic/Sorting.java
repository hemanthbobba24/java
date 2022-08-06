import java.util.*;
class Sorting{
	public static void main(String[]args){
		int temp;
		int A[]={1,2,3,4,5};
		for(int i=0;i<A.length;i++){
			for(int j=i;j<A.length;j++){
				if(A[i]>A[j]){

               temp=A[i];
               A[i]=A[j];
               A[j]=temp;
           }
			}
		
	}
	for(int a: A){
	System.out.print("<"+a);
	}
}
}