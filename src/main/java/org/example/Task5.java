package org.example;

public class Task5 {
    public static void main(String[] args){
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height1));

        int[] height2 = {1,1};
        System.out.println(maxArea(height2));
    }

    public static int maxArea(int[] heights){
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            if (area > maxArea){
                maxArea = area;
            }
            if (heights[left] <= heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }
}
