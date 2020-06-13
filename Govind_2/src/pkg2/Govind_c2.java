package pkg2;

public class Govind_c2 {

public int mul(int a, int b)
{
	int c;
	c= a*b;
	return c;
}

public int sum (int a, int b)
{
    int d;
    d= a+b;
    return d; 
}

public int sub (int a, int b)
{

	int e;
	e= a-b;
	return e;
}

public void div (int a, int b)
{

	int f;
    f = a/b;
    System.out.println("First Assignment Result is "+f);
}

public static void main(String[] args) 
{
	Govind_c2 ob= new Govind_c2();
	int result_mul= ob.mul(10, 2);
	int result_sum= ob.sum(result_mul, 2);
	int result_sub= ob.sub(result_sum,2);
	int result_sum1= ob.sum(result_sub, 2);
	ob.div(result_sum1, 2);
} 

}

