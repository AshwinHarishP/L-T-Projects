import java.util.*;
class Customer
{
String name;
int units;
double bill;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the customer: ");
name=sc.next();
System.out.println("Enter the number of units consumed: ");
units=sc.nextInt();
}
void calculate()
{
if(units<=200)
{
bill=units*0.8;
}
else if(units<=300)
{
bill=units*1.2;
}
else if(units>300)
{
bill=units*1.5;
}
}
void print()
{
System.out.println("\nName: "+name);
System.out.println("\nUnits consumed: "+units);
System.out.println("\nBill amount: "+bill);
}
}
class CustomerDemo
{
public static void main(String args[])
{
Customer c=new Customer();
c.accept();
c.calculate();
c.print();
}
}
