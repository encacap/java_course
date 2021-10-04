package bh2;

public class Tron {

    private float r;
    private double PI;

    public Tron(float r) {
        this.r = r;
        this.PI = Math.PI;
    }

    public Tron() {
        this.r = 1.0f;
        this.PI = Math.PI;
    }

    public double chuVi() {
        return 2 * r * this.PI;
    }

    public double dienTich() {
        return Math.pow(this.r * 2, 2) * this.PI;
    }

    @Override
    public String toString() {
        return String.format("Ban kinh: %.2f", this.r);
    }

}
