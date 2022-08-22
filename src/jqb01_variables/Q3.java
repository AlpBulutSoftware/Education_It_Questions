package jqb01_variables;

public class Q3 {
    public static void main(String[] args) {
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

        int principal = 10000, rate = 6, numberOfYear = 3;

        int simpleInterest = principal * rate * numberOfYear / 100;

        System.out.println("The simple interest amount  is $" + simpleInterest);
    }
}
/*
The simple interest amount  is $1800
 */