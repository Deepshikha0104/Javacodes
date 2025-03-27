package Numberss Manipulation;

import java.util.*;

public class ArnStrongnumber {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int digit = countDigit(number);
    int sum = calculatePower(digit, number);
    checkArmstrong(sum, number);

    static int countDigit(int n) {
        int digitcount = 0;
        while(n != 0) {
            n = n/10;
            digitcount++;
        }
        return digitcount;
    }
    static int calculatePower(int power, int n) {
        int sum = 0;
        while(n != 0) {
            int powerResult = 1;
            int digit = n%10;
            for(int i=1;i<power;i++) {
                powerResult = powerResult* digit;
            }
            sum = sum + powerResult;
            n = n/10;
        }
        return sum;
    }
    static void checkArmstrong(int sum, int num) {
        if(sum == num) {
            System.out.println(num + " is an Armstrong number.");
        }
        else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
