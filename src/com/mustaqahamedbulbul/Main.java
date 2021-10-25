package com.mustaqahamedbulbul;

public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        int res = calculator.calculate(10,5,'+');

        System.out.println(res);

        res = calculator.calculate(10,5,'-');
        System.out.println(res);

        res = calculator.calculate(10,5,'*');
        System.out.println(res);

        res = calculator.calculate(10,5,'+');
        System.out.println(res);


        res = calculator.calculate(10,5,'R');
        System.out.println(res);

    }
}
