// package Arrayss;

// public class RemoveDuplicate {
//     public static void main(String[] args) {
//         int arr[] = {10,20,20,30,30,40,50,50};
//         int n  = arr.length;
//         if (n==0 || n==1) {
//             for(int i=0;i<n;i++){
//                 System.out.println(arr[i]+" ");
//             }
//             return;
//         }
//     int[] temp = new int[n];
//     int j = 0;
//     for(int i=0;i<n-1;i++){
//         if(arr[i]!=arr[i+1]){
//             temp[j++] = arr[i];
//         }
//     }
//     temp[j++] = arr[n-1];
//     for(int i=0;i<j;i++){
//         arr[i] = temp[i];
//     }
//     for(int i=0;i<j;i++){
//         System.out.println(arr[i]+ " ");
//     }
//     }
// }
// ________________________________________________________________________
package Arrayss;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        Arrays.sort(arr);
        int temp[] = new int arr.length();
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!= arr[i+1]){
                temp[j] = i;
            }
            temp[j] = arr.length()-1;
        }
        System.out.println(temp[j]);
        }
}
