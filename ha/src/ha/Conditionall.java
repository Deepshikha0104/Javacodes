//24-07-2023

//------------------- CONDITIONAL STATEMENT------------------------


package ha;
import java.util.Scanner;

public class Conditionall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year of salary : ");
		int yos = sc.nextInt();
		System.out.println("Enter salary :");
		int sal = sc.nextInt();
		int swb = sal + (sal*5/100);
		if(yos > 5) {
			System.out.println("You are eligible for bonus");
			System.out.println("Net bonus amount " + swb);
		}
		else {
			System.out.println("You are not eligible for Bonus ");
		}	
	}
}

public class Conditionall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch =sc.next().charAt(0);
		if(ch == 'a'|| ch== 'e'||ch == 'i'|| ch=='o' || ch=='u') {
			System.out.println("given character is a vowel.");
		}
		else {
			System.out.println("Not a vowel");
		}		
	}
}


public class Conditionall {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter salary :");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	int w = sc.nextInt();

	if(x*y == z*w) {
		System.out.println("True");
	}
	else {
		System.out.println("false ");
	}	
}
}

public class Conditionall {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Character : ");
	char ch =sc.next().charAt(0);
	if(isConditionall(ch)) {
		System.out.println("given character is a vowel.");
	}
	else {
		System.out.println("Not a vowel");
	}		
}
}

public class Conditionall {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int x = sc.nextInt();
	int Conditionall;

	if(x>=0 ) {
		Conditionall = x;
	}
	else {
		Conditionall = -x; 
	}	
	System.out.println("The Conditionall of " + x + "  "+"is " + Conditionall );
}
}




