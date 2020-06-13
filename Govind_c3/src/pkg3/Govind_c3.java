package pkg3;
public class Govind_c3 {
	
	int x=10; //this is global variable
	int y=2;  //this is global variable

	public int div(int a, int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
	public int mul(int a, int b)
	
	{
		int d;
		d=a*b;
		return d;
	}
	
	public int sum (int a, int b)
	{
		int e;
		e=a+b;
		return e;
	}
	
	public void sub (int a, int b)
	{
		int f;
		f=a-b;
		System.out.println("Second assignment result is "+f +" using second method");
	}
	public static void main(String[] args) 
	{
	Govind_c3 ob= new Govind_c3();
	int result_div= ob.div(ob.x, ob.y);
	int result_mul= ob.mul(result_div, ob.y);
	int result_sum1= ob.sum(result_mul, ob.y);
	int result_sum2= ob.sum(result_sum1, ob.y);
	ob.sub(result_sum2,ob.y);
	}
}
