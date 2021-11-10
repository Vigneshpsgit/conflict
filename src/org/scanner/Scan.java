package org.scanner;

import java.util.Scanner;

public class Scan {
private void test() {
	// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println("enter the empid");
short empid = s.nextShort();
System.out.println(empid);

System.out.println("enter the empname");
String empname = s.next();
System.out.println(empname);

System.out.println("enter the empemail");
String empemail = s.next();
System.out.println(empemail);

System.out.println("enter the empphoneno");
long phno = s.nextLong();
System.out.println(phno);

System.out.println("enter the empsalary");
float sal = s.nextFloat();
System.out.println(sal);

System.out.println("enter the gender");
String gen = s.next();
System.out.println(gen);

System.out.println("enter the empcity");
String city = s.next();
System.out.println(city);
}
public static void main(String[] args) {
	Scan sc = new Scan();
	sc.test();
}
}
