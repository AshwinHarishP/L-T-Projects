import java.util.*;
class Employee
{
String name,id,address,dept,designation,email;
float salary;
Employee(String name,String id,String address,String dept,String designation,String 
email,float salary)
{
this.name=name;
this.id=id;
this.address=address;
this.dept=dept;
this.designation=designation;
this.email=email;
this.salary=salary;
}
void display(float bonus)
{
System.out.println("Employee name:"+name+"\nEmployee id:"+id+"\nEmployee 
address:"+address+"\nEmployee department:"+dept+"\nEmployee 
designation:"+designation+"\nEmployee email:"+email+"\nEmployee 
salary:"+salary+"\nBonus:"+bonus);
System.out.println("----------------------------------");
}
}
class Main
{
public static void main(String args[])
{
Scanner scr=new Scanner(System.in);
System.out.println("Enter no. of Employee:");
int n=scr.nextInt();
Employee e[]=new Employee[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter employee name:");
String name=scr.next();
System.out.println("Enter employee id:");
String id=scr.next();
System.out.println("Enter employee address:");
String address=scr.next();
System.out.println("Enter employee department:");
String dept=scr.next();
System.out.println("Enter employee designation:");
String designation=scr.next();
System.out.println("Enter employee email:");
String email=scr.next();
System.out.println("Enter employee salary:");
float salary=scr.nextFloat();
e[i]=new Employee(name,id,address,dept,designation,email,salary);
}
float bonus;
for(int i=0;i<n;i++)
{
if(e[i].designation.equals("M"))
bonus=e[i].salary*0.1f;
else if(e[i].designation.equals("TL"))
bonus=e[i].salary*0.15f;
else if(e[i].designation.equals("SSE"))
bonus=e[i].salary*0.17f;
else
bonus=e[i].salary*0.2f;
e[i].display(bonus);
}
}
}
