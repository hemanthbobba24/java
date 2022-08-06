class Patient extends BloodData{
 int Idnumber;
 int age;
 Patient(){
 super("O",'+');
 Idnumber=0;
 age=0;
 }
 Patient(int Idnumber,int age,String BloodData,char RHfactor){
 super(BloodData,RHfactor);
 this.Idnumber=Idnumber;
 this.age=age;
 }
 public int getIdnumber(){return Idnumber;}
 public int getage(){return age;}
}
class TestPatient{
public static void main(String args[]){
 Patient obj1=new Patient();
 Patient obj2=new Patient(1205,40,"B",'+');
 System.out.println("Id number:"+obj1.getIdnumber());
 System.out.println("Age:"+obj1.getage());
 System.out.println("Blood Data:"+obj1.getBloodData());
 System.out.println("RHfactor:"+obj1.getRHfactor());
 System.out.println("Id number:"+obj2.getIdnumber());
 System.out.println("Age:"+obj2.getage());
 System.out.println("Blood Data:"+obj2.getBloodData());
 System.out.println("RHfactor:"+obj2.getRHfactor());
 }
}