package Arrayss;
public class FindDuplicatenum {
    public static void main(String[] args) {
        int nums[] = new int[] {1,3,4,2,2,4};
        int t = nums[0];
        int h = nums[0];
        do{
            t=nums[t];
            h = nums[nums[h]];
        }while (t!=h);
        t = nums[0];
        while (t!=h) {
            t = nums[t];
            h = nums[h];
        }
        System.out.println(h);
    }
}
