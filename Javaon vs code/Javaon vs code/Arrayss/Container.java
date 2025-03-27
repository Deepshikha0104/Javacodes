package Arrayss;

import java.util.Scanner;

public class Container {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        maxArea();
    }
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length -1;
        int maxarea = 0;
        while(l < r) {
            int length = Math.min(height[l], height[r]);
            int breadth = r - l;
            int currArea = length * breadth;
            if(currArea > maxarea) {
                maxarea = currArea;
            }
            if(height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
    }
}
