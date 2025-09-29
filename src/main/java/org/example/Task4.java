package org.example;

public class Task4 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(java.util.Arrays.toString(addOne(arr)));
    }

    public static int[] addOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
