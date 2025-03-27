package ha;
import java.util.Scanner;

sum of last digit numbers
public class Lastdigigitsum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE TWO NUMBERS");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a%10;
		int d = b%10;
		int sum = c + d; 
		System.out.println("sum of Last Digit number is: " + sum );
	}
}

//CORRESPONDING UNICODE OF CHARACTERS

public class Lastdigigitsum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE characters");
		char ch =sc.next().charAt(0);
		int n = ch;
		System.out.println(n);

	}
}

//number to character

public class Lastdigigitsum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE characters");
		int num1 = sc.nextInt();
		char ch = (char)num1;
		System.out.println(ch);
	}
}






//question :- find the principle

public class Lastdigigitsum {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amounts: ");
	double SI = sc.nextDouble();
	double R = sc.nextDouble();
	double T = sc.nextDouble();
    double P  = (SI*100)/R*T ;
	System.out.println(" THE SI   : " +  P);	

}
}

//find the greatest number

public class Lastdigigitsum {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amounts: a,b,c : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int result = (a>b)?(a>c?a:c):(b>c?b:c); 
	System.out.println(" THE greatest number is   : " +  result);	

}
}

//find the smallest number

public class Lastdigigitsum {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amounts: a,b,c : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int result = (a<b)?(a<c?a:c):(b<c?b:c); 
	System.out.println(" THE SMALLEST number is   : " +  result);	
}
}


public class Lastdigigitsum {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length and breadth  a,b : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int area = a*b;
	int perimeter = 2*(a+b);  
	int result = (a==b)?(area):(perimeter); 
	System.out.println(" THE SMALLEST number is   : " +  result);	
}
}




