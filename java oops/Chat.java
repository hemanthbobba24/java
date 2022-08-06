import java.util.*;
class Q
{
Scanner insendMessage=new Scanner(System.in);
int n;
String Message;
boolean valueSet = false;
synchronized int recvMessage()
{
while(!valueSet)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("InterruptedException caught");
}
System.out.println("User2 Type Message");
Message=insendMessage.nextLine();
valueSet = true;
System.out.println("User2(User1):" + Message);
valueSet=false;
notify();
return n;
}
synchronized void sendMessage(int n)
{
while(valueSet)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("InterruptedException caught");
}
this.n = n;
System.out.println("User1 Type Message");
Message=insendMessage.nextLine();
valueSet = true;
System.out.println("User1(User2):" + Message);
notify();
}
}
class Producer implements Runnable
{
Q q;
Thread t;
Producer(Q q)
{
this.q=q;
t=new Thread(this, "Producer");
}
public void run()
{
int i = 0;
while (true)
{
if(i>5)
{
System.exit(0);
}
q.sendMessage(i++);
}
}
}
class Consumer implements Runnable
{
Q q;
Thread t;
Consumer (Q q)
{
this.q = q;
t=new Thread (this,"Consumer");
}
public void run ()
{
while(true)
{
q.recvMessage();
}
}
}
public class Chat
{
public static void main(String args[])
{
Q q =new Q();
Producer p = new Producer (q);
Consumer c = new Consumer (q);
p.t.start();
c.t.start();
System.out.println("Press Control-C to stop. ");
}
}