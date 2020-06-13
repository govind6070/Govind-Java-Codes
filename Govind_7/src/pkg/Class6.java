package pkg;

public class Class6 extends Class5 {
	
public void sum (int a, int b)
{   int c;
    super.a=8;
    super.b=2;
    c=a+b;
    System.out.println("Third possibility Result is "+c);
    super.c= super.a+super.b;
    System.out.println("Using super output from parent is "+super.c);
}
public static void main(String[] args) {
	Class6 ob = new Class6();
	Class5 ob1 = new Class5(); // has a relationship
	ob1.a= 3;
	ob1.b =3;
	ob.sum(ob1.a,ob1.b);

}

}