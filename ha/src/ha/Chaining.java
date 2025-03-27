package ha;
import java.util.Scanner;

// Given integer is divisible by 3 and 4 BOTH
public class Chaining {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an intger number : ");
		int a = sc.nextInt();
		if(a%3==0 && a%4==0) {
			System.out.println("Given intger is divisible by both 3 and 4");
		}
		else {
			System.out.println("Given intger is not divisible by both 3 and 4");
		}
	}
}



//public class Chaining {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter an intger number : ");
//	int x = sc.nextInt();
//	int y = sc.nextInt();
//	int z = sc.nextInt();
//
//	if(x/3==0) {
//		System.out.println("Given intger is divisible by both 3 and 4");
//	}
//	else {
//		System.out.println("Given intger is not divisible by both 3 and 4");
//	}
//}
//}




//public class Chaining {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("ENTER THE characters");
//	char ch =sc.next().charAt(0);
//	if(ch=='M' || ch=='m') {
//		System.out.println("You Are A male");
//	}
//	else if(ch=='F' || ch=='f') {
//		System.out.println("You are a Female ");
//	}
//	else {
//		System.out.println("TYPE AGAIN");
//	}
//}
//
//}


//public class Chaining {
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter age,salary rank :");
//		int exeperince = sc.nextInt();
//		int salary = sc.nextInt();
//		int rank = sc.nextInt();
//		if(exeperince>=10 || salary>= 50000 || rank>=10) {
//			System.out.println("You ARe in top management");
//		}
//		else {
//			System.out.println("You are not in top management");
//		}
//		
//	}
//}

//public class Chaining {
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter height,weight,age:");
//		int height = sc.nextInt();
//		int weight = sc.nextInt();
//		int age = sc.nextInt();
//		if(height==5 || weight==50 || age==10) {
//			System.out.println("Overweight");
//		}
//		else if(height==5 || weight==60) {
//			System.out.println("Fat");
//		}
//		else if(height==6 || weight==50) {
//			System.out.println("Slim");
//		}
//
//		else {
//			System.out.println("None");
//		}
//		
//	}
//}


//public class Chaining {
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter two intger numbers");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a>100 && b>10) {
//			System.out.println("A is above 100 and b is above 10");
//		}
//		else if(a>50 && b>50) {
//			System.out.println("A is above 50 and b is above 50");
//		}
//		else if(a>20 && b>100) {
//			System.out.println("A is above 20 and b is above 100");
//		}
//		else {
//			System.out.println("None");
//		}
//	}
//}


//public class Chaining {
//public static void main(String [] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter Marks , rank:");
//	int marks = sc.nextInt();
//	int rank = sc.nextInt();
//	if(marks>20 || rank>100) {
//		System.out.println("Needs Improvement");
//	}
//	else if(marks>40 || rank>80) {
//		System.out.println("Concentrate");
//	}
//	else if(marks>60 || rank>120) {
//		System.out.println("Needs To focus");
//	}
//	else if(marks>100 || rank<10) {
//		System.out.println("Very Good");
//	}
//	else {
//		System.out.println("You are a bright Student");
//	}
//}
//}

//public class Chaining {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the Character : ");
//	char ch =sc.next().charAt(0);
//	if(ch=='A' || ch=='a') {
//		System.out.println("EXCELLENT");
//	}
//	else if(ch=='B'|| ch=='b') {
//		System.out.println("Well done");
//	}
//	else if(ch=='C'||ch=='c') {
//		System.out.println("You Passed");
//	}
//	else if(ch=='F'||ch=='f') {
//		System.out.println("Better luck next time");
//	}
//	else {
//		System.out.println("Invalid Grade");
//	}		
//}
//}

//public class Chaining {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the Character : ");
//	char ch =sc.next().charAt(0);
//	if(ch=='A' || ch=='a') {
//		System.out.println("EXCELLENT");
//	}
//	else if(ch=='B'|| ch=='b') {
//		System.out.println("Well done");
//	}
//	else if(ch=='C'||ch=='c') {
//		System.out.println("You Passed");
//	}
//	else if(ch=='F'||ch=='f') {
//		System.out.println("Better luck next time");
//	}
//	else {
//		System.out.println("Invalid Grade");
//	}		
//}
//}


//public class Chaining {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter 3 intger numbers x,y,z : ");
//	int x = sc.nextInt();
//	int y = sc.nextInt();
//	int z = sc.nextInt();
//	if(x%3==0) {
//		if(y>=200) {
//			System.out.println("The value of z is : "+ (10+z));
//		}
//		else if(y>=100 || y<200) {
//			System.out.println("The value of z is : "+ (5+z));
//		}
//		else if(y>=50 || y<100) {
//			System.out.println("The value of z is : "+ (4+z));
//		}
//		else if(y<50) {
//			System.out.println("The value of z is : "+ (1+z));
//		}
//	}
//	if(x%3!=0) {
//		if(y>=200) {
//			System.out.println("The value of z is : "+ (3+z));
//		}
//		else if(y>=100 || y<200) {
//			System.out.println("The value of z is : "+ (2+z));
//		}
//		else if(y<100) {
//			System.out.println("The value of z is : "+ (1+z));
//		}
//	}
//		System.out.println("The program added 10 to the value of z" + "  "+"The Final value of z is " + (10+z));
//}
//}



