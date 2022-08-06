import java.util.*;
class PhoneCallArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
PhoneCall arr[]=new PhoneCall[8];
String
phonenumbers[]={"9951680195","7455605049","6309291826","5669998166",
"9951680195","7455605049","6309291826","5669998166"};
for(int i=0;i<4;i++){
arr[i]=new incomingCall(phonenumbers[i]);
}
for (int i=4;i<8;i++){ 
arr[i]=new Outgoingcall(phonenumbers[i],10);
}
for(int i=0;i<8;i++){
arr[i].display();
System.out.println();
}
}
}