class CaesarCipher
{
String mEncryption(int key, String text){
String result = "";
for (int i=0; i<text.length(); i++)
{
if (Character.isUpperCase(text.charAt(i)))
{
char ch = (char)(((int)text.charAt(i) + key - 65) % 26 + 65);
result+=""+(ch);
}
else
{
char ch = (char)(((int)text.charAt(i) + key - 97) % 26 + 97);
result+=""+(ch);
}
}
return result;
}
String mDecryption(int key, String text){
String result = "";
for (int i=0; i<text.length(); i++)
{
if (Character.isUpperCase(text.charAt(i)))
{
char ch = (char)(((int)text.charAt(i) + (26-key) - 65) % 26 + 65);
result+=""+(ch);
}
else
{
char ch = (char)(((int)text.charAt(i) + (26-key) - 97) % 26 + 97);
result+=""+(ch);
}
}
return result;
}
}
public class TestCeaserCipher{
public static void main(String[] args)
{
CaesarCipher message = new CaesarCipher();
int key = 20;
String text = "Hemanth";
String text2 = message.mEncryption(key, text);
String text3 = message.mDecryption(key, text2);
System.out.println("Text : " + text);
System.out.println("Shift : " + key);
System.out.println(text2);
System.out.println(text3);
}
}