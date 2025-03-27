package methodss;

public class NonStaticInitializer {
	int a = 15;
	int b;
	int c;
	int d;
	{
		System.out.println("NSI-1");
		System.out.println(a+" "+b+" "+c+" "+d+" ");
		b = 23;
	}
	public int test(){
		return 45;
	}
	{
		System.out.println("NSI-II");
		System.out.println(a+" "+b+" "+c+" "+d+" ");
		c = test();
	}
	public NonStaticInitializer(int a,int b,int c,int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	{
		System.out.println("NSI-III");
		System.out.println(a+" "+b+" "+c+" "+d+" ");
		d=100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  NonStaticInitializer d= new NonStaticInitializer(15,30,20,40);
		System.out.println(d.a+" "+d.b+" "+d.c+" "+d.d+" ");
	}
}


