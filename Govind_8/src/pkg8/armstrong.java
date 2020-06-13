package pkg8;
import java.util.Scanner;
public class armstrong {
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.println("Enter the number to check if its armstrong");
int num = ob.nextInt();
//  finding the length of entered number
int n1=num; // storing value in another variable so orginal number remain unchange
int length=0;
while (n1!=0)
{
  n1=n1/10;
  length = length + 1;
}
////////// till now we have found the length of the number
///////// now we would multiply each digit of number and then add them
int n2 =num; // storing value in another variable so orginal number remain unchange
int rem; //variable that would store remainder and it would get us each digit in the number but in reverse order
int sum=0; // variable to sum the square, cube etc of each digit
while (n2!=0)
{
rem =n2%10;
System.out.println("Last digit is "+rem);
int mul =1;

  for (int i=1;i<=length;i++)
  {
	  mul = mul*rem;
	  System.out.println("Result of multiplication is "+mul);
  }
sum = sum + mul; 
n2 = n2/10;
}
System.out.println("Sum is "+sum);
if (sum==num)	
{
System.out.println("**Number is Armstrong**");
}

else {
	System.out.println("**Number is not Armstrong**");
}
}
}
