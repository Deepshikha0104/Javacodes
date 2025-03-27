package ha;
import java.util.Scanner;

//public class Ranges {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int n = sc.nextInt();
//		int count = 0,sum = 0;
//		while(n>0) {
//			count = n%10;
//			sum = n/10;
//			count = sum+count;		
//		}
//		System.out.println(count);
//	}
//}


//Question  first number of the series 2,9,16,23............n
//
//public class Ranges{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int n = sc.nextInt();
//		int i = 2;
//		while(i<n) {
//			System.out.println(i);
//			i+=7;
//		}
//	}
//}


//Question  first number of the series 3,7,11,15,.............n

//public class Ranges{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int n = sc.nextInt();
//		int i = 3;
//		while(i<n) {
//			System.out.println(i);
//			i+=4;
//		}
//	}
//}

//5's Table in reverse order

//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number : ");
//	int n = sc.nextInt();
//	int i = 10;
//	while(i>0) {
//		System.out.println("5*10" + "="+" "+(i*5));
//		i--;
//	}
//}
//}

//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number : ");
//	int n = sc.nextInt();
//	int i=0;
//	while(i>n) {
//		i = i%2;
//		System.out.println(i);
//		i--;
//	}
//}
//}


//Question  first number of the series 13,18,23,28,33............n
//
//public class Ranges{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int n = sc.nextInt();
//		int i = 13;
//		while(i<n) {
//			System.out.println(i);
//			i+=5;
//		}
//	}
//}

//Question  first number of the series 2,9,16,23............n
//
//public class Ranges{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int n = sc.nextInt();
//		int i = 2;
//		while(i<n) {
//			System.out.println(i);
//			i+=7;
//		}
//	}
//}




//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Multiple of 8 numbers are : - ");
//	int n = 1;
//	int i = 10;
//	while(i>0) {
//		System.out.println(i*8-n);
//		n++;
//		i--; 
//		
//	}
//}
//}


//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number : ");
//	int i = 30;
//	while(i>0) {
//		System.out.println(i);
//		i-=4;
//	}
//}
//}

//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number : ");
//	int n = sc.nextInt();
//	int i = 30;
//	while() {
//		System.out.println(i);
//		i+=2;
//	}
//}
//}
//
//n,n-3,n-6 ...........................

//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int i = sc.nextInt();
//	while(n>=0) {
//		System.out.println(n + " ");
//		n-=i;
//	}
//}
//}

//n,n-k,n-2k..............................

//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	int k = sc.nextInt();
//	while(n>=0) {
//		System.out.println(n + " ");
//		n-=k;
//	}
//}
//}


//public class Ranges {
//    public static void main(String[] args) {
//        int n = 20; 
//        while (n >= 1) {
//            if (n % 2 != 0) {
//                System.out.print(n + " ");
//            }
//            n--;
//        }
//    }
//}

//public class Ranges {
//    public static void main(String[] args) {
//        int n = 20; 
//        while (n >= 1) {
//            if (n % 2 == 0) {
//                System.out.print(n + " ");
//            }
//            n--;
//        }
//    }
//}



//public class Ranges{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int n = sc.nextInt();
//		int evensum = 0;
//		int oddsum = 0;
//		do {
//			int digit = n%10;
//			if(digit%2==0) {
//				evensum+=digit;
//			}
//			else {
//				oddsum+=digit;
//			}
//			n /= 10;
//		}while(n>0);
//		System.out.println("Sum of even Digits :" + evensum);
//		System.out.println("sum of odd Digitsn: " + oddsum);
//	}
//}


//public class Ranges{
//	public static void main(String []args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int n = sc.nextInt();
//		int positivenumber = 0;
//		int negativenumber = 0;
//			if(n>0) {
//				positivenumber+=n;
//			}
//			else {
//				negativenumber+=n;
//			}
//		System.out.println("Sum of Positive Number :" + positivenumber);
//		System.out.println("sum of Negative Number: " + negativenumber);
//	}
//}




//___________________________________________________________________________________
//HAPPY NUMBER


//public class Ranges{
//public static void main(String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number :");
//	int n = sc.nextInt();
//	int positivenumber = 0;
//	int negativenumber = 0;
//		if(n>0) {
//			positivenumber+=n;
//		}
//		else {
//			negativenumber+=n;
//		}
//	System.out.println("Sum of Positive Number :" + positivenumber);
//	System.out.println("sum of Negative Number: " + negativenumber);
//}
//}
//______________________________________________________________________________________
//divided by 3 program

//public class Ranges{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		while(n>0) {
//			System.out.println(n);
//			n= n/3;
//		}
//	}
//}
//_____________________________________________________________________________________________
//
//print AAA,bb,CCC,dd,EEE,ff___________________________
//
//public class Ranges{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	for(char ch = 'A';ch<='Z';ch+=2) {
//		System.out.println(" "+ch+ch+ch+" ,"+(char)(ch+33)+(char)(ch+33)+" ,");
//	}
//}
//}
//__________________________________________________________________________________________________
//power of 2 that are less then n if n is 10 1,2,4....8
//public class Ranges{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Eneter the number : ");
//	int n = sc.nextInt();
//	int pd = 1;
//	while(pd<n) {
//		System.out.println(pd +" ");
//		pd*=2;
//	}
//}}
//}
//}
//________________________________________________________________________________________________________
//WAJP TO THAT TAKES INTEGER N AS AN INPUT AND RETURNS A LIST OF ALL THE MULTIPLES OF 3,5 AND 3 AND 5 BOTH STARTING FROM 1 TO N
//
//public class Ranges{
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number: ");
//	int n = sc.nextInt();
//	for(int i=1;i<=n;i++) {
//		if(i%3==0) {
//			System.out.println("Multiple of 3:"+n);
//		}
//		else if(i%5==0) {
//			System.out.println(" Multiple of 5 nubers"+n);
//		}
//		else if(i%3==0 && i%5==0) {
//			System.out.println("Multiple of both 3 and 5 :" + n);
//		}
//	}
//}
//}
//___________________________________________________________________________________________
//
public class Ranges{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int n1 = 1;
	int n2 =2;
	int n3 = n1+n2 ;
	while(n>=0) {
		System.out.println(n1);
		n1 = n2;
		n2 = n3;
		}
	}	
}









