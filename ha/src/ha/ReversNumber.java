package ha;
import java.util.Scanner;

public class ReversNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		while(n>0) {
			count = 0;
			n = n/10;
			count++;
		}
	}
}
