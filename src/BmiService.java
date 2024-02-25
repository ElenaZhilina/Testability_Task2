public class BmiService {
    public double calculate(double heightMeter, double weightKg) {
        return (int) (weightKg / heightMeter / heightMeter);
    }
}
