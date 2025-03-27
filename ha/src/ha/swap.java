package ha;
import java.util.Scanner;
 
//       DATE  21-07-2023

// QUESTION -> TWO NUMBERS SWAPPING PROGRAM
//method 1 
public class swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap : " + a +" " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after Swap : " + a +" " + b);
	}
}

//  ----------METHOD2 (WITHOUT USING ANY VARIABLE )

public class swap {
public static void main(String[] args) {
	// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before Swap : " + a +" " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("after Swap : " + a +" " + b);
}
}

//QUESTION MFIND THE AREA AND PERIMETER OF THE REACTANGLE TAKE THE USER INPUT LENGTH AND BREADTH

public class swap {
public static void main(String[] args) {
	// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE LENGTH AND BREADTH :");
    int l = sc.nextInt();
    int b = sc.nextInt();
    int A = l * b;
    System.out.println("Area of reactangle : "+ A);
    int P = 2 *(l + b);
    System.out.println("Perimetere of rectangle :" + P);
}
}

// QUESTION FIND THE AREA AND PERIMETER OF THE SQURE 

public class swap {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE  SIDE OF SQUARE :");
    int u = sc.nextInt();
    int A = u*u;
    System.out.println("Area of SQUARE : "+ A);
    int P = 4*u;
    System.out.println("Perimetere of SQUARE :" + P);
}
}
//____________________________________________________________________________________________________________________________

//TAKE  LENGTH AND HEIGHT FROM THE USER AND FIND AREA OF TRIANGLE
// WAJP TO TAKE TEMPRETURE IN CELCIUS AND CONVERT IT TO "F" AND "K" (C*9 / 2) + 32


public class swap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LENGTH AND HIEGHT OF TRIANGLE : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int A = 1/2 *b*l;
		System.out.println("Area of triangle : "+A);	
	}
}

LENGTH BRAEDTH AND HEIGHT FROM THE USER AND FIND AREA AND VOLUME] OF CUBOIDE 2(L*B*H)

public class swap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LENGTH AND HIEGHT OF CUBOIDE : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int A = 2*(l*b*h);
		System.out.println("Area of CUBOIDE : "+A);	
	}
}

WAJP TO TAKE LENGTH IN CENTIMETER OF A STICK AND CONVERT LENGTH INTO METER AND FEET

double meter;  
meter = value_in_cm / 100;  
public class swap{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of STICK : ");
	int l = sc.nextInt();
	double f = sc.nextDouble();
	float m;
	m = l/100;
	f = 0.0328 * l ;   
	System.out.println("    "  +f + " " + m);	
}
}



WAJP TO TAKE TEMPRETURE IN CELCIUS AND CONVERT IT TO "F" AND "K" (C*9 / 2) + 32

public class swap{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the TEMPRETURE  IN CELCIUS: ");
	double c = sc.nextDouble();
	double a = (c * 9/5)+32;
	double b = (c + 273.15);
	System.out.println(" the tempreture in ferhenite :"  + a + " Tempreture in kelvin :" + b);	
}
}


  WAJP TO FIND SIMPLE INTEREST AND TAKE P,R,T INPUT FROM THE USER

public class swap{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amounts: ");
	double P = sc.nextDouble();
	double R = sc.nextDouble();
	double T = sc.nextDouble();
	Double SI = (P*R*T)/100;
	System.out.println(" THE SI   : " +  SI);	
}
}

