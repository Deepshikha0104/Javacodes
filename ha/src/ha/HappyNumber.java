package ha;
import java.util.Scanner;
//
//
//Question -> HAPPY NUMBER PROGRAMM
//
//public class HappyNumber {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		do {
//			int sum =0;
//			do {
//				int rem = n%10;
//				sum+= rem*rem;
//				n = n/10;
//			}while(n>0);
//			n = sum;
//			}while(n>9);
//			if(n==1 ||n==7) {
//				System.out.println("Happy NUmber");
//			}
//			else {
//				System.out.println("Not a Happy Number");
//			}
//		}
//	}
//
//
//                   NEON NUMBER PROGRAM
//
//
//public class HappyNumber {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		int square = n*n;
//		int sum=0,rem=0;
//		do {
//			rem = square%10;
//			sum = rem + sum;
//			square = square/10;
//			}while(square>0);
//			if(sum==n) {
//				System.out.println("Neon NUmber");
//			}
//			else {
//				System.out.println("Not a Neon Number");
//			}
//		}
//	}
//
//________________________________________________________________________
//        ARMSTRONG NUMBER
//
//
//public class HappyNumber {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		int count =0;
//		int n1=n;
//		int n2 = n;
//		do {
//			n = n/10;
//			count++;
//			}while(n>0);
//		int sum =0;
//		do {
//			int rem = n1%10;
//			int pd=1;
//			for(int i=1;i<=count;i++) {
//				pd*=rem;
//			}
//			sum+=pd;
//			n1/=10;
//		}while(n1>0);
//			if(n2==sum) {
//				System.out.println("ArmStrong NUmber");
//			}
//			else {
//				System.out.println("Not a ArmStrong Number");
//			}
//		}
//	}
//______________________________________________________________________________
//
//Question -> take i/p from the user n aned return the nth power of 2 .
//   2 power 3 = 8
//
//public class HappyNumber {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number");
//	int n = sc.nextInt();
//	int power = sc.nextInt();
//	power*=n;
//	System.out.println(power);
//	}
//}
//_________________________________________________________________________________
//
//                   Palindrome number
//
//public class HappyNumber {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number");
//	int n = sc.nextInt();
//	int n1=n,rev =0;
//	do {
//		int rem = n%10;
//		rev = rem+rev*10;
//		n=n/10;
//	}while(n>0);
//	if(n1==rev) {
//		System.out.println("Given number is a palindrome number");
//	}
//	else {
//		System.out.println("Given number is not a palindrome number");
//	}
//	}
//}
//______________________________________________________________________________________
//Question -> Print Fibonnacci series  
//0,1,1,2,3,5,8,13,21,34,55------------------etc.
//
//public class HappyNumber{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int n = sc.nextInt();
//		int count = 0;
//		int n1 = 0;
//		int n2 = 1;
//		do {
//			System.out.println(n1 + " ");
//			int n3 = n1+n2;
//			n1 = n2;
//			n2 = n3;
//			count++;
//		}while(count<n);
//	}
//}
//_____________________________________________________________________________________
//find factorial of a number
//
//public class Ranges{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number");
//	int n = sc.nextInt();
//	int i=1, fact=1;
//	for(i=1;i<=n;i++) {
//		fact = fact*i;
//	}
//	System.out.println("Factorial number is "+ fact);
//}
//}
