/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harvous
 */
public class Operation<T extends Number> {

    private T a, b;
    
    public Operation()
    {
        
    }
    
    public Operation(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public Number add() {
        return a.doubleValue() + b.doubleValue();
    }

    public Number minus() {
        return a.doubleValue() - b.doubleValue();
    }

    public Number multiply() {
        return a.doubleValue() * b.doubleValue();
    }

    public Number divide() {  
        return a.doubleValue() / b.doubleValue();
    }
    //check double va int
    public static String formatResult(Number result) {
        if (result.doubleValue() % 1 == 0) {
            return String.valueOf(result.intValue());
        }
        else {
            return String.valueOf(result.doubleValue());
        }
    }

    public static void main(String[] args) {
        Operation<Integer> op = new Operation<>(5, 0);
        System.out.println("Add: " + Operation.formatResult(op.add()));
        System.out.println("Minus: " + Operation.formatResult(op.minus()));
        System.out.println("Multiply: " + Operation.formatResult(op.multiply()));
        System.out.println("Divide: " + Operation.formatResult(op.divide()));
    }
}
