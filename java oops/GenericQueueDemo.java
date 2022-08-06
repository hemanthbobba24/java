import java.util.*;
interface GenericQueueable<E>{
public void insertEnd(E x); public
E removeBegin(); public void
print(); public boolean
isEmpty();
}
class GenericQueue<E> implements GenericQueueable<E>{
List<E> stackList;
GenericQueue() { stackList
= new ArrayList<>();
}
public void insertEnd(E e) {
stackList.add(e);
}
public E removeBegin() {
stackList.remove(stackList.get(0));
return null;
}
public void print(){
System.out.print("["); for(int i =
0;i<stackList.size();i++){
System.out.print(stackList.get(i)+" ");
}
System.out.print("]");
System.out.println();
}
public boolean isEmpty() {
if (stackList.isEmpty()){
return true; } else {
return false;
}
}
}
public class GenericQueueDemo
{
public static void main(String[] args) {
GenericQueue<Integer> q = new GenericQueue<>();
q.insertEnd(1216);
q.insertEnd(895);
q.removeBegin();
q.insertEnd(15956);
q.insertEnd(67410);
System.out.println(q.isEmpty()+": Queue is isEmpty");
q.print();
}
}