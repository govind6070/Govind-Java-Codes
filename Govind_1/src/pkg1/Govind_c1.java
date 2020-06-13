package pkg1;

public class Govind_c1
{
  int age;
  int roll_no;

  public void mthd1()
  {
	  System.out.println("Welcome to all");
  }
  public void mthd2()
  {
	 System.out.println("Welcome Guyz");
  }
public static void main(String[] args) 
{
Govind_c1 obj1 = new Govind_c1();

obj1.age=12;
obj1.roll_no=33;

System.out.println(obj1.age);
System.out.println(obj1.roll_no);

obj1.mthd1();
obj1.mthd2();

Govind_c1 obj2 = new Govind_c1();

obj2.age= 123;
obj2.roll_no = 34;

System.out.println(obj2.age);
System.out.println(obj2.roll_no);

obj2.mthd1();
obj2.mthd2();
}

}
