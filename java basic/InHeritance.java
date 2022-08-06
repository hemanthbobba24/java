import java.util.*;
class Hello{
	int i;
	void hii(int i){
		this.i=i;
		System.out.println("this is in  hii method "+i);
	}
}
 class Welcome extends Hello{
 	void hii(int i){
 		this.i=i;
 		super.hii(i);
 	}
 	 void display(){
 		System.out.println("this is in the sub class of hii method"+i);

 	}
 }
 class InHeritance{
 	public static void main(String[]args){
 		Welcome w=new Welcome();
 		w.hii(7);
 		w.display();
 	}
 }