package org.example;

public class Task2 {
    public static void main(String[] args) {
        generateParentheses(3);
    }

    private static void generateParentheses(int n) {
        build("", 0, 0, n);
    }

    private static void build(String current, int open, int close, int max) {
        if (open == max && close == max) {
            System.out.println(current);
            return;
        }
        if (open < max) {
            build(current + "{", open + 1, close, max);
        }
        if (close < open) {
            build(current + "}", open, close + 1, max);
        }
    }
}
