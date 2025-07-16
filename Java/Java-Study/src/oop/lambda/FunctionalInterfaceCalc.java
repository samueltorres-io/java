package oop.lambda;

@FunctionalInterface
interface Calc {
    double calc (double a, double b);
}

public class FunctionalInterfaceCalc {
    public static void main(String[] args) {

     Calc sum = (a, b) -> a + b ;
     System.out.println(sum.calc(10,37));

     Calc sub = (a, b) -> a - b;
     System.out.println(sub.calc(60, 43));

     Calc mul = (a, b) -> a * b;
     System.out.println(mul.calc(8, 256));

     Calc div = (a, b) -> a / b;
     System.out.println(div.calc(256, 12));

    }
}
