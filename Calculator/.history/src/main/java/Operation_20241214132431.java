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
        return a.add(b);
    }

    public BigDecimal minus() {
        return a.subtract(b);
    }

    public BigDecimal multiply() {
        return a.multiply(b);
    }

    public BigDecimal divide(RoundingMode roundingMode) {
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    
        int scale = Math.max(a.stripTrailingZeros().scale(), b.stripTrailingZeros().scale()) + 5; // Thêm 5 chữ số để tăng độ chính xác
    
        // Chia với scale tự động và roundingMode
        return a.divide(b, scale, roundingMode).stripTrailingZeros();
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
        System.out.println("Divide: " + Operation.formatResult(op.divide( RoundingMode.HALF_UP))); // Precision up to 10 digits
    }
}
