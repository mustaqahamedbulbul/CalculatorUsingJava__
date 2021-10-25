package com.mustaqahamedbulbul;

public class Calculator {

    public int calculate(int a, int b, char op) {
        int res = 0;
        switch (op) {
            case  '+':
                res = add(a,b);
                break;
            case  '-':
                res = a - b;
                break;
            case  '*':
                res = a * b;
                break;
            case  '/':
                if (b!=0) {
                    res = a/b;
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
        return res;
    }

    private int add(int a, int b) {
        return a+b;
    }
}
