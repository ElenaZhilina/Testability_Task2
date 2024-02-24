public class BmiService {
    public double calculate(double heightMeter, double weightKg) {
        return (weightKg / heightMeter / heightMeter);
    }
}
