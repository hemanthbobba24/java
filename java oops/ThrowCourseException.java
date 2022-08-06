class CourseException extends Exception
{
public CourseException(String message)
{
super(message);
}
}
class Course
{
private String courseDepartment;
private int courseNum;
private double courseCredits;
public Course(String courseDepartment, int courseNum, double courseCredits)throws CourseException

{
if(courseDepartment.length() != 3 || (courseNum < 100 || courseNum
> 499) || (courseCredits < 0.5 || courseCredits > 6))

{
throw new CourseException("Course Information is Invalid: " + courseDepartment + "," + courseNum + "," + courseCredits);


}
this.courseDepartment = courseDepartment;
this.courseNum = courseNum;
this.courseCredits = courseCredits;
}
public String GetCourseDepartment()
{
return courseDepartment;
}
public int getCourseNum()
{
return courseNum;
}
public double getCourseCredits()
{
return courseCredits;
}

public String toString()
{
return courseDepartment + "," + courseNum + "," + courseCredits;
}
}
public class ThrowCourseException
{
public static void main(String[] args)throws CourseException
{
Course[] course = new Course[6];
try{
course[0] = new Course("COM",209, 3);
System.out.println("Course: " + course[0] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
try{
course[0] = new Course("COM",209, 3);
System.out.println("Course: " + course[0] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
try{
course[1] = new Course("ACC",303, 0.3);
System.out.println("Course: " + course[1] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
try{
course[2] = new Course("PHY",101, 4);
System.out.println("Course: " + course[2] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
try{
course[3] = new Course("ECO",500, 2);
System.out.println("Course: " + course[3] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
try{
course[4] = new Course("COM",209, 3);
System.out.println("Course: " + course[4] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
try{
course[5] = new Course("HUMM",10, 3);
System.out.println("Course: " + course[5] + "." + "Created Successfully.");

}
catch(CourseException e){
System.out.println(e);
}
}
}