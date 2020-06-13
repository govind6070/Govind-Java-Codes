package pkg4;
public class tryc {	

public tryc() {
	this(10,2);
}
	
public tryc(int a,int b) {
	int rslt;
		rslt= mul(a,b);
		rslt= sum(rslt,b);
		rslt= sub(rslt,b);
		rslt= sum(rslt,b);
		rslt = div(rslt,b);
		System.out.println("Result is "+rslt);
	}
public int mul (int a,int b)	
	{
		int c;
		c= a*b;
		return c;
	}
public int sum (int a, int b) {
	int d;
	d= a+b;
	return d;
}
public int sub (int a,int b) {
	int e;
	e=a-b;
	return e;
}
public int div (int a,int b) 
{
   int f;
   f=a/b;
   return f;
}
public static void main(String[] args) {

tryc ob2 = new tryc();
}
}
