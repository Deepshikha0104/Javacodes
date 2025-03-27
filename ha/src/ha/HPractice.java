//Date 25-07-2023

//Question 1.-> You have to take an integer as input and print true if it is an even number and false otherwise

//Question 2.->
package ha;
//import java.util.Scanner; 


//Question -> You will be given three integer inputs x, y, z. You have to find the sum of these inputs. Print true if the sum is less than 150 and false otherwise.

import java.util.Scanner; 
//public class HPractice {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
//		int sum = x+y+z;
//		if(sum < 150) {
//			System.out.println("True");
//		}
//		else 
//		{
//			System.out.println("false");
//		}
//	}
//}

//question -> Meet Sarah, a software engineer who works for a tech company. As part of her job, she was tasked
//with writing a program that takes an integer input and prints "true" if it is greater than 1000, and "false" if it is not.

import java.util.Scanner; 
//public class HPractice {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int x = sc.nextInt();
//		if(x < 1000) {
//			System.out.println("True");
//		}
//		else 
//		{
//			System.out.println("false");
//		}
//	}
//}

		
import java.util.Scanner; 
//public class HPractice {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int sum = x+y;
//		if(sum <= 100) {
//			System.out.println("High Sum");
//		}
//		else 
//		{
//			System.out.println("Low Sum");
//		}
//	}
//}


Question -> You have to take an integer as input and print true if it is an even number and false otherwise.

import java.util.Scanner; 
//public class HPractice {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int x = sc.nextInt();
//		if(x%2 == 0) {
//			System.out.println("True");
//			System.out.println("The given number is even.");
//		}
//		else 
//		{
//			System.out.println("false");
//		}
//	}
//}


Question -> You will be given an integer as input, you have to print true if the number is greater than 100, and false otherwise.

import java.util.Scanner; 
//public class HPractice {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int x = sc.nextInt();
//		if(x > 100) 
//			System.out.println("True");
//		else 
//		
//			System.out.println("false");
//		
//	}
//}

Question-> Take income of a person as input from the user, print No tax to be paid if income is less than 500,000 and print
Tax to be paid if income is greater than or equal to 500,000.

import java.util.Scanner; 
//public class HPractice {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int x = sc.nextInt();
//		if(x >= 500000) {
//			System.out.println("NO tax to be paid");
//		}
//		else 
//		{
//			System.out.println("Tax to be paid");
//		}
//	}
//}


Question -> You will be given age as an integer input from the user, and print according to the conditions given below
1 -a. Print Super Senior Citizen if age is equal to or above 70.
b. Print Senior Citizen if age is below 70 but equal to or above 59.
C. Print Adult if age is below 59 but equal to or above 18.
d. Print Underage is age is below 18 but above 1.
e. Print New Born if none of the above conditions follow.


import java.util.Scanner; 
public class HPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		if(age >= 70) {
			System.out.println("SUPER SENOIR CITIZEN");
		}
		else if(age<=70 && age>=59){
			System.out.println("Senior Citizen");
		}
		else if(age<59 && age>=18){
			System.out.println("ADULT");
		}
		else if(age<18 && age>=1){
			System.out.println("UNDERAGE");
		}
		else
		{
			System.out.println("NEW BORN");
		}
	}
}


import java.util.Scanner; 
public class HPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter your Salary");
		int sal = sc.nextInt();
		System.out.println("Enter the exeperience");
		int exeperience = sc.nextInt();
		if(age>60 && sal>20000 && exeperience>20) {
			System.out.println("Final Salary is " + (sal+5000));
		}
		else if(age>40 && sal>15000 && exeperience>10)
		{
			System.out.println("Final Salary is " + (sal+2000));
		}
		else if(age>30 && sal>10000 && exeperience>5)
		{
			System.out.println("Final Salary is " + (sal+1000));
		}
		else {
			System.out.println("Final Salary is " + (sal+500));
		}
	}
}

import java.util.Scanner; 
public class HPractice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first integer: ");
	int x = sc.nextInt();
	System.out.println("Enter the last integer");
	int y = sc.nextInt();
	if(x>=59 && y>=10) {
		System.out.println("x is greater then or equal to 59 and y is greater then or equal to 10");
	}
	else if(x>=50 && y>=10)
	{
		System.out.println("x is greater then or equal to 50 and y is greater then or equal to 10");
	}
	else {
		System.out.println("None of the condition is matching ");
	}
}
}

import java.util.Scanner; 
public class HPractice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first integer: ");
	int marks = sc.nextInt();
	if(marks>33) {
		System.out.println("No Grace Marks" + "  " + "final marks is  "+marks);
	}
	else
	{
		System.out.println("final marks is " + (marks+4));
	}
}
}

import java.util.Scanner; 
public class HPractice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Year: ");
	int year = sc.nextInt();
	if(year%4 ==0) {
		System.out.println("Given year is Leap year");
	}
	else
	{
		System.out.println("Not leap");
	}
}
}

import java.util.Scanner; 
public class HPractice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Date is formate (DD-MM-YYYY): ");
	int DD = sc.nextInt();
	int MM = sc.nextInt();
	int YYYY = sc.nextInt();

	if((DD<1|| DD>31)||(MM<1 || MM>12)||(YYYY<1)){
		System.out.println("Invalid Date");
	}
	else if(DD>30 && (MM==4 || MM==6 || MM==9 || MM==11)){
		System.out.println("Invalid date");
	}
	else if(DD>29 && MM==2)
	{
		System.out.println("Invalid Date");
	}
	else if(DD>28 && (YYYY%400==0) || (YYYY%4==0 && YYYY%100!=0)) {
		System.out.println("Invalid Date");
	}
	else {
		System.out.println("Valid Date");
	}
}
}


import java.util.Scanner; 
public class HPractice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three numbers : ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();

	if((x>=y && x<=z) || (x>=z && x<=y)) {
		System.out.println(x);
	}
	else if((y>=z && y<=z) || (y>=z && y<=x)) {
		System.out.println(y);
	}
	else {
		System.out.println(z);
	}	
}
}

import java.util.Scanner; 
public class HPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>=20 && z <100) {
			System.out.println("Final value of z :" + (200+z));
		}
		else if(x>=10 || y<50)
		{
			System.out.println("The final value of z is: " + (100+z));
		}
	}
}

import java.util.Scanner; 
public class HPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int z = sc.nextInt();
		if(x>=20 && z <100) {
			System.out.println("Final value of z :" + (200+z));
		}
		else if(x>=10 || y<50)
		{
			System.out.println("The final value of z is: " + (100+z));
		}
	}
}

import java.util.Scanner; 
public class HPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int age = sc.nextInt();
		int sal = sc.nextInt();
		if(age>40) {
			if(sal>=30000) {
				System.out.println("You are rich and adult.");
			}
			else {
				System.out.println("You Are an Adult.");
			}
		}
		else if(age<=40)
		{
			if(sal>=12000) {
				System.out.println("You are rich and young");
			}
			else {
				System.out.println("You are Young.");
			}
		}
		}
	}
import java.util.Scanner; 
public class HPractice {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the three numbers : ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	if(x>=20) {
		if(y>=100) {
		System.out.println("Final value of z :" + (100+z));
	}
		if(y<100 && y>=50) {
			System.out.println("Final value of z :" + (50+z));
		}
		else {
			System.out.println("Final value of z is " + (z+10));
		}
		}
	else if(x<20)
	{
		if(y>=100) {
			System.out.println("Final value of z is " + (z+3));
		}
		if(y<100 &&y>=50) {
			System.out.println("Final value of z is " + (z+2));
		}
		else {
			System.out.println("Final value of z is " + (z+1));

		}
	}
}
}





