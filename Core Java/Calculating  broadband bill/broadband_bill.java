import java.util.Scanner;
public class broadband_bill {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of MB used:");
int mbUsed = scanner.nextInt();
int totalCost = 0;
if (mbUsed <= 1024) {
totalCost = 500;
} else if (mbUsed <= 2048) {
totalCost = (mbUsed - 750) ;
} 
else {
totalCost = 500 + 250 + (mbUsed - 2048) * 3;
}
if (mbUsed <= 0) {
 System.out.println(mbUsed +" Is Not Valid Input\n");
 }
System.out.println("Total broadband bill: " + totalCost + " rupees");
}
}
