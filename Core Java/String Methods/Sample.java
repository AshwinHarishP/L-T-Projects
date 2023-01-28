public class Sample
{
public static void main(String[] args)
{
String str = "Learnnew things will help to enhance our skills";
System.out.println("Given String: " + str);
//1. Check if the given string is empty
if(str.isEmpty())
{
System.out.println("Given string is empty.");
}
else
{
System.out.println("Given string is not empty.");
}
//2. Remove whitespace from the given string
String strWithoutSpace = str.replaceAll("\\s", "");
System.out.println("String without space: " + strWithoutSpace);
//3. Find the length of the given string
int length = strWithoutSpace.length();
System.out.println("Length of the given string: " + length);
//4. Find the index of char: i
int index = str.indexOf('i');
System.out.println("Index of char i: " + index);
//5. Reverse the words of the given string
String[] words = str.split("\\s");
String reverseString = "";
for(int i = words.length-1; i>=0; i--)
{
reverseString += words[i] + " ";
}
System.out.println("Reverse String: " + reverseString);
//6. Find the substring from 2nd char to 10th char
String substring = str.substring(2, 10);
System.out.println("Substring from 2nd char to 10th char: " + substring);
//7. Replace (help) with (like)
String replacedString = str.replace("help", "like");
System.out.println("Replaced String: " + replacedString);
//8. Find the hashcode of the given string
int hashcode = str.hashCode();
System.out.println("Hashcode of the given string: " + hashcode);
//9. Display the characters one by one using loop
for(int i = 0; i < str.length(); i++)
{
System.out.print(str.charAt(i) + " ");
}
System.out.println();
//10. Change the case of given character uppercase into lowercase
String lowercase = str.toLowerCase();
System.out.println("Lowercase String: " + lowercase);
}
}
