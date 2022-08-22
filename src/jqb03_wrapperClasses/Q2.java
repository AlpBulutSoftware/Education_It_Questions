package jqb03_wrapperClasses;

public class Q2 {
    public static void main(String[] args) {

        byte first = Byte.valueOf("100");
        System.out.println(first);

        short second = Short.valueOf("2300");
        System.out.println(second);

        System.out.println(second - first);
    }
}
/*
100
2300
2200
 */