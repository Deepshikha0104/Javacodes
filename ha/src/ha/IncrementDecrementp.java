//package ha;
//public class IncrementDecrementp {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 5;
//		int b = 10;
//		int result = a++ - a + b++ + b--;         
//		System.out.println(a+ " "+b+ " "+ result); 6,10,20
//	}
//}
//________________________________________________________________________________________________
//package ha;
//public class IncrementDecrementp {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 5;
//		int b = 10;
//		int result = a++ + a-- + --b-a + b-- + ++b - a++;         
//		System.out.println(a+ " "+b+ " "+ result); //6,9,28
//	}
//}
//________________________________________________________________________________________________

//package ha;
//public class IncrementDecrementp {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 5;
//		int b = 10;
//		int result = a/10 + a++ - a-- %b-- + a++ -a-- +b++ + ++b;         
//		System.out.println(a+ " "+b+ " "+ result); //5,11,8
//	}
//}
//________________________________________________________________________________________________

package ha;
public class IncrementDecrementp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int result = ++a * --a + b++/ --a + a*b --%5 + a++ + b++ - a-- -a++ ;         
		System.out.println(a+ " "+b+ " "+ result); //5,11,41
	}
}


