package numberss;

public class Lcmnum {
    public static void main(String[] args) {
        int n = 70;
        int m = 50;
        int max = (n>m) ? n:m;
        int lcm = max;
        while(lcm % n!=0 || lcm % m!=0){
            lcm++;
        }
        System.out.println(lcm);
    }
}

// public class Lcmnum {
//     public static void main(String[] args) {
//         int n = 10;
//         int m = 20;

//         while(m!=0){
//             int temp = m;
//             m = n%m;
//             n = temp;
//         }
//         int hcf =n;
//         int lcm = (n*m)/hcf;
//         System.out.println(lcm);
//     }
// }
