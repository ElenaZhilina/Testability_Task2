public class BmiService {
    public int calculate(double heightMeter, double weightKg) {
        return (int) (weightKg / heightMeter / heightMeter);
    }
}
