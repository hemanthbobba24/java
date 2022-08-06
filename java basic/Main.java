import java.util.*;
class Student{
	int rollno;
	String name;
	Student(){
     Scanner s=new Scanner(System.in);
     System.out.println("enter the name of the student");
     name=s.next();
     System.out.println("enter the rollno of the student");
     rollno=s.nextInt();
	}

}
class Main{
	public static void main(String[]args){
	 Student[] s=new Student[3];
	 s[0]=new Student();
	 s[1]=new Student();
	 for(int i=0;i<s.length;i++)
	 System.out.println("the mail of the student is:"+s[i].name+"."+s[i].rollno+"@gmail.com");
	}
}