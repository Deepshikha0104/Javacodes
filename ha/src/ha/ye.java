package ha;

//
//public class ye { 
//	public static void main(String args[]) {
//		byte age = 32;
//		System.out.println("Age="+age);
//		short year = 2023;
//		System.out.println("year="+year);
//		int sal = 365000;
//		System.out.println("Salary="+sal);
//		long pop = 999999999999l;
//		System.out.println("population="+pop);
//	}
//
//}


//2. public char charAt(int): -> This is a non static method of String class and it accepts an index no as argument and returns the character present at that index.
//
//class Demo{
//public static void main(String[] args) {
//	String name=new String("Sachin");
//    char ch;
//    ch=name[0]; //ERROR, becuase the operator[] only works with array 
//    ch=name.charAt(0);
//    System.out.println(ch); OK, will display 'S'
//    ch-name.charAt(3);
//    System.out.println(ch); OK, will display 'h'
//    ch-name.charAt(7); // EXCEPTION, StringIndexOutOfBoundsException
//    System.out.println(ch);
//}
//}



public class ye { 
public static void main(String args[]) {
	String s1 = new String("Bhopal");
	String s2 = new String("Bhopal");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1==s2);
	ans = s1.equals(s2);
	boolean ans;
	System.out.println(s2);
}
}

