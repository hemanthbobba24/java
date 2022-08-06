import java.util.*;
class Department{ 
        String departmentname;
	String hodname;
	int students;
	int sections;	
	void showDepartmentDetails(){
	Scanner s=new Scanner(System.in);
	departmentname=s.next();
	hodname=s.next();
	students=s.nextInt();
	sections=s.nextInt();	
	System.out.println("the name of  department is"+departmentname);
	System.out.println("the no of sections"+sections);
	System.out.println("the name of  hod is"+hodname);
	System.out.println("total no of students"+students);
}
public static void main(String[]args){
  Department obj=new Department();
  obj.showDepartmentDetails();
}
}