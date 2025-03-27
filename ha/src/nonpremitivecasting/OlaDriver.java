package nonpremitivecasting;

public class OlaDriver extends Ola {

	public static void main(String[] args) {
		Ola o = new CarTaxi();
		Ola o1 = new BikeTaxi();
		o.transportation();
		System.out.println(o.capacity);
		System.out.println(o.tyre);
	}
}
