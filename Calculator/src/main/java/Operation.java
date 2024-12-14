import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operation<T extends Number> {

    private BigDecimal a, b;

    public Operation() {
    }

    public Operation(T a, T b) {
        this.a = new BigDecimal(a.toString());
        this.b = new BigDecimal(b.toString());


    }

    void checkHighersixteen() {
        if (this.a.toString().length() > 16 || this.b.toString().length() > 16) {
            throw new ArithmeticException("Number is too large");
        }
    }

    public BigDecimal getA() {
        return a;
    }

    public void setA(T a) {
        this.a = new BigDecimal(a.toString());
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(T b) {
        this.b = new BigDecimal(b.toString());
    }

    public BigDecimal add() {
        checkHighersixteen();
        return a.add(b);
    }

    public BigDecimal minus() {
        checkHighersixteen();
        return a.subtract(b);
    }

    public BigDecimal multiply() {
        checkHighersixteen();
        return a.multiply(b);
    }


    public BigDecimal divide() {
        checkHighersixteen();
        RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    
        int scale = Math.max(a.stripTrailingZeros().scale(), b.stripTrailingZeros().scale()) + 15; // Thêm 5 chữ số để tăng độ chính xác
    
        // Chia với scale tự động và roundingMode
        return a.divide(b, scale, ROUNDING_MODE).stripTrailingZeros();
    }

    // Check and format result as integer or decimal
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
        System.out.println("Divide: " + Operation.formatResult(op.divide())); // Precision up to 10 digits
    }
}
