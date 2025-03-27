package Arrayss;
import java.util.Scanner;
public class Maxlengthname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter length of array : ");
        int n = sc.nextInt();
        String[] name = new String[n];

        for(int i=0;i<n;i++){
            name[i] = sc.nextInt();
        }
        int max = name[0].length();
        int index = 0;
        for(int i=0;i<n;i++){
            if(name[i].length()>max){
                max = name[i].length();
                index = i;
            }
        }
        System.out.println(index);
    }
}
