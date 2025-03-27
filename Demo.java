import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("Addition result:" + c);
    }

}

