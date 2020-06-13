package pkg8;

public class fibnocci {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	System.out.println("Fibonacci series is ");
	System.out.println(a);
	System.out.println(b);
	int sum;
	for (int i=1;i<=10;i++)
	{  
		sum = a+b;
		System.out.println(""+sum);
		a=b;
		b=sum;	
	}
}
}
