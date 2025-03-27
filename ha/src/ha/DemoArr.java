package ha;

public class DemoArr {
	public static void main(String[] args) {
		int ar[] = new int[5];
		System.out.println(ar); //[I@5acf9800
		System.out.println(ar[2]); //0
		double []d =new double[5]; 
		System.out.println(d); //[D@4617c264
		System.out.println(d[2]); //0.0
		
		boolean []b = new boolean[5];
		System.out.println(b);//  [Z@36baf30c
		System.out.println(b[2]);    //false
		
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1] = 'b';
		System.out.println(ch);  //ab
		System.out.println(ch[2]);  //blank
	}
}
