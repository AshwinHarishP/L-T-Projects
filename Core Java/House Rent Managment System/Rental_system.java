import java.util.*; public 
class Rental_system { 
static int flat=9; 
static int num_flat=0; 
static String a="name :",b="age :",c="aadhar no:"; 
static String user="Ashwin"; static String 
pass="21cs019"; 
static HashMap<Integer,HashMap<String,String>> tentant=new HashMap<>(flat); 
static int arr[]=new int[]{0,0,0,0,0,0,0,0,0}; static Scanner sc =new 
Scanner(System.in); public static boolean check_aadhar(String aadhar) { 
 String patt="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"; 
if(aadhar.matches(patt)) { 
 return true; 
 } 
 return false; 
} 
public static String name() { 
 System.out.println("Enter the name:"); 
 String name=sc.next(); 
return name; 
} 
public static String age() { 
System.out.println("Enter the age"); 
 String age=sc.next(); 
return age; 
} 
public static void tentant_add() { 
 System.out.println("Enter the aadhar number:"); 
 String aadhar=sc.next(); 
if(check_aadhar(aadhar)) { 
int n=0; for(int 
i=0;i<9;i++) { 
if(arr[i]==0) { n=i+1; 
arr[i]=1; break; 
 } 
 } 
 HashMap<String,String> map=new HashMap<>(3); 
 
 
 
 String name=name(); 
 System.out.println("------------------------------------------------------"); 
String Age=age(); map.put(a, name); map.put(b, Age); 
map.put(c, aadhar); tentant.put(n,map); 
 System.out.println("Your flat no is:"+n); 
 } 
else { 
 System.out.println("Enter the correct aadhar no:"); 
tentant_add(); 
 } } 
public static void details() { 
 System.out.println("choose the option \n fulldetails(f) \n particular(p)"); 
 String d=sc.next(); 
if(d.equalsIgnoreCase("p")) { 
System.out.println("Enter the flat no:"); 
int n=sc.nextInt(); if(n<flat) { 
if(arr[n-1]==1) { 
 System.out.println("------------------------------------------------------"); 
 System.out.println("Flat no:"+n); 
 System.out.println("Tentant name:"+tentant.get(n).get(a)); 
 System.out.println("Tentant age:"+tentant.get(n).get(b)); 
 System.out.println("Tentant aadhar number:"+tentant.get(n).get(c)); 
 System.out.println("------------------------------------------------------"); 
 } 
 else { 
 System.out.println("The flat "+n+"is empty"); 
 } 
} 
 else { 
 System.out.println("Wrong flat number!!"); 
details(); 
 } 
 } 
 else if(d.equalsIgnoreCase("f")) { 
System.out.println("Full details:"); 
 System.out.println("------------------------------------------------------"); 
for(int i=0;i<flat;i++) { 
 if(arr[i]==0) 
continue; 
 System.out.println("Flat no:"+(i+1)); 
 System.out.println("Tentant name:"+tentant.get(i+1).get(a)); 
 System.out.println("Tentant age:"+tentant.get(i+1).get(b)); 
 System.out.println("Tentant aadhar number:"+tentant.get(i+1).get(c)); 
 System.out.println("------------------------------------------------------"); 
 
} 
} 
} 
public static void details_change() { 
 System.out.println("choose option :\n 1.remove\n2.change"); 
int n=sc.nextInt(); if(n==1) { 
 System.out.println("Enter the tentant flat number to be removed:"); 
int f=sc.nextInt(); if(f<flat) { tentant.replace(f, null); arr[f-1]=0; 
 num_flat--; 
 } 
else { 
 System.out.println("Enter the correct flat number!"); 
details_change(); 
 } 
 } 
if(n==2) { 
 System.out.println("Enter the flat number to be changed:"); 
int f=sc.nextInt(); if(f<flat) { if(arr[f-1]==1) { 
 System.out.println("Enter the changing name:"); 
 String nam=sc.next(); 
 System.out.println("Enter the age to be changed:"); 
 String ag=sc.next(); 
 System.out.println("Enter the aadhar number to be changed:"); 
 String ad=sc.nextLine(); 
tentant.get(f).replace(a, nam); 
tentant.get(f).replace(b, ag); 
 tentant.get(f).replace(c,ad); 
 } 
 else { 
 System.out.println("the flat "+f+" is empty"); 
 } } 
else { 
 System.out.println("Enter the correct flat number!"); 
details_change(); 
 } 
} } 
public static void user_and_password_change() { 
System.out.println("Enter the user name to be changed: "); 
String u=sc.next(); 
System.out.println("Enter the password the password to be changed: "); 
String p=sc.next(); 
user=u; 
pass=p; 
 
} 
public static void admin() { 
 
 System.out.println("Enter the user name: "); 
 String u=sc.nextLine(); 
 System.out.println("Enter the password: "); 
 String p=sc.nextLine(); 
 
 if(u.equals(user)&&p.equals(pass)) { 
 
 System.out.println("Choose the option:"); 
 System.out.println("1.tentant details"); 
 System.out.println("2.tentant change"); 
 System.out.println("3.admin password and username change"); 
int n=sc.nextInt(); switch(n) { case 1: details(); break; 
case 2: details_change(); break; case 3: 
 user_and_password_change(); 
break; 
 
 
 } } 
else { 
 System.out.println("Enter the right password or username!"); 
admin(); 
 } 
} 
public static void main(String []args) { 
 String s=""; 
 
 do { 
 System.out.print("Choose the option (Tentant/Admin):"); 
String in=sc.nextLine(); if(in.equalsIgnoreCase("Tentant")) 
{ 
 if(num_flat<flat) { 
tentant_add(); 
 num_flat++; 
} 
} 
if(in.equalsIgnoreCase("admin")) { 
admin(); 
 
} 
 sc.nextLine(); 
 System.out.println("Do you want to continue (Y/N): "); 
s=sc.nextLine(); 
 }while(s.equalsIgnoreCase("y")); 
} 
}