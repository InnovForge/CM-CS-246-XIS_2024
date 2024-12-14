/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harvous
 */
import java.math.BigDecimal;
import java.math.BigInteger;

public class Operation<T extends Number> {

    private BigDecimal a, b;
    
    public Operation() {
        
    }
    
    public Operation(T a, T b) {
        this.a = new BigDecimal(a.toString());
        this.b = new BigDecimal(b.toString());
    }

    public T getA() {
        return (T) a;
    }

    public void setA(T a) {
        this.a = new BigDecimal(a.toString());
    }

    public T getB() {
        return (T) b;
    }

    public void setB(T b) {
        this.b = new BigDecimal(b.toString());
    }

    public BigDecimal add() {
        return a.add(b);
    }

    public BigDecimal minus() {
        return a.subtract(b);
    }

    public BigDecimal multiply() {
        return a.multiply(b);
    }

    public BigInteger divide() {  
        BigInteger tempA = a.toBigInteger();
        BigInteger tempB = b.toBigInteger();
        return tempA.divide(tempB);
    }
    //check double va int
    public static String formatResult(BigDecimal result) {
        if (result.stripTrailingZeros().scale() <= 0) {
            return result.toBigInteger().toString();
        } else {
            return result.toPlainString();
        }
    }

    public static void main(String[] args) {
        Operation<BigDecimal> op = new Operation<>(new BigDecimal("9999999999999"), new BigDecimal("3"));
        System.out.println("Add: " + Operation.formatResult(op.add()));
        System.out.println("Minus: " + Operation.formatResult(op.minus()));
        System.out.println("Multiply: " + Operation.formatResult(op.multiply()));
        //System.out.println("Divide: " + Operation.formatResult(op.divide()));
    }
}
