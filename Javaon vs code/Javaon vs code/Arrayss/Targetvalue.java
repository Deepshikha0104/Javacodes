package Arrayss;

public class Targetvalue {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int target  = 8;
        int left = arr[0];
        int right = arr.length-1;
        int count = 0;
        while(left < right) {
            if(arr[left] + arr[right] == target) {
                count++;
                left++;
                right--;
            }
            else if(arr[left] + arr[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }

    }
}
