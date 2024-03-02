/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harvous
 */
public class Operation {

    private double a, b;

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
//        if (b == 0) {
//            throw new ArithmeticException("Cannot divide by zero!");
//        }
        return a / b;
    }
}

//      double x = 2;
//        double m = 1.1;
//        double sum = (x + m);
//        if (sum % 1 != 0) {
//            System.out.println(sum);
//        } else {
//            System.out.println((int) sum);
//        }
