public class MyMapTest
{
public static void main(String[] args)
{
MyMapImpl<Integer, String> map = new MyMapImpl<Integer,String>();

System.out.println("Going to add entries in map");
map.add(null,"Nothing");
map.add(1, "ETC");
map.add(2, "John");
System.out.println("Displaying all the entry in map");
map.print();
System.out.println("Removing the entry with key 2");
map.remove(2);
map.print();
System.out.println("Adding duplicate key 1 in map");
map.add(1, "CSE");
map.add(2, "John again");
System.out.println("Displaying all the entry in map again");
map.print();
System.out.println("Adding entry with key 17 in map");
map.add(17, "CS");
map.print();
System.out.println(map.isEmpty()+" Empty?");
map.keys();
}
}