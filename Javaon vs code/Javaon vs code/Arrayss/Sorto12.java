package Arrayss;

public class Sorto12 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        // sortArray(arr);
        int low = 0,mid =0, high=arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }  
    }
}
