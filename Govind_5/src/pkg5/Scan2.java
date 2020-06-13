package pkg5;
import java.util.Scanner;
public class Scan2 {	
public Scan2() {
	System.out.println("Lets solve ((((x1+x2)*x3)+x4)-x5)/2)) ");
}
// This is constructor taking input from user
public Scan2(int x1,int x2,int x3, int x4, int x5) {
	int rslt;
		rslt= sum(x1,x2);
		rslt= mul(rslt,x3);
		rslt= sum(rslt,x4);
		rslt= sub(rslt,x5);
		rslt = div(rslt,2);
		System.out.println("Result is "+rslt);
	}
public int mul (int a,int b)	
	{
		int c;
		c= a*b;return c;      }
public int sum (int a, int b) {
	int d;
	d= a+b;return d;          }
public int sub (int a,int b) {
	int e;
	e=a-b;return e;           }
public int div (int a,int b) 
{
   int f;
   f=a/b;return f;            }
public static void main(String[] args) {
Scan2 ob2 = new Scan2();
Scanner input = new Scanner(System.in);
System.out.println("Ënter value of x1");
int x1= input.nextInt();
System.out.println("Ënter value of x2");
int x2= input.nextInt();
System.out.println("Ënter value of x3");
int x3= input.nextInt();
System.out.println("Ënter value of x4");
int x4= input.nextInt();
System.out.println("Ënter value of x5");
int x5= input.nextInt();
Scan2 ob3 = new Scan2(x1,x2,x3,x4,x5);}}