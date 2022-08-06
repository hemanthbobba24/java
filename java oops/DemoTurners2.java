
class Turnleft implements Turner{
public void Turn(){
System.out.println("Turning left.");
}
}

class Turnright implements Turner{
public void Turn(){
System.out.println("turning right.");
} 
}

class DemoTurners2 extends DemoTurners{
public static void main(String args[]){
Turnleft obj4=new Turnleft();
Turnright obj5=new Turnright();
Turnleft obj6=new Turnleft();
Turnright obj7=new Turnright();
obj4.Turn();
obj5.Turn();
obj6.Turn();
obj7.Turn();
}
}