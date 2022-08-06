import java.util.*;
class BloodData{
 String BloodData;
 char RHfactor;
 BloodData(){
 BloodData="O";
 RHfactor='+';
 }
 BloodData(String BloodData,char RHfactor){
 this.BloodData=BloodData;
 this.RHfactor=RHfactor;
 }
 public String getBloodData(){return BloodData;}
 public char getRHfactor(){return RHfactor;}
 public void setBloodData(String BloodData){this.BloodData=BloodData;}
 public void setRHfactor(char RHfactor){this.RHfactor=RHfactor;}
}
class TestBloodData extends BloodData{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 BloodData obj1=new BloodData();
 BloodData obj2=new BloodData("A",'-');
 System.out.println(obj1.getBloodData()+obj1.getRHfactor());
 System.out.println(obj2.getBloodData()+obj2.getRHfactor());
 }
}