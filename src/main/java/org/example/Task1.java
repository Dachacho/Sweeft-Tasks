package org.example;

public class Task1 {
    public static void main(String[] args) {
        String test = "bebebf";

        if(canBePalindromeByRemovingOneChar(test)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean canBePalindromeByRemovingOneChar(String str) {
        if (isPalindrome(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(i);
            if (isPalindrome(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
