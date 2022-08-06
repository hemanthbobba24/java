
interface Turner{
void Turn();
}

class Leaf implements Turner{
public void Turn(){System.out.println("changing colors.");
}
}

class Page implements Turner{
public void Turn(){System.out.println("Going to next page.");
}
}

class Pancake implements Turner{
public void Turn(){
System.out.println("flipping.");
}
}

class DemoTurners{
public static void main(String args[]){
Leaf obj1=new Leaf();
Page obj2=new Page();
Pancake obj3=new Pancake(); 
obj1.Turn();
obj2.Turn();
obj3.Turn();
}
}