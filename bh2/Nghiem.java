package bh2;

public class Nghiem {
    private double x1;
    private double x2;

    public Nghiem(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return String.format("Nghiem: %.2f, %.2f", x1, x2);
    }
}
