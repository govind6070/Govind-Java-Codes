package pkg8;

import java.util.Scanner;

public class table {
public static void main(String[] args) {
 Scanner ob = new Scanner(System.in);
 System.out.println("You want to know table of which number?");
 System.out.println("Please enter the number");
 int num =ob.nextInt();
 int table;
 for (int i=1;i<=10;i++)
 {
	 table = num*i;
	 System.out.println(num+ "*"+i +"= "+table);
 }
}
}
