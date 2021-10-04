package bh2;

public class ChuNhat {

    private float a;
    private float b;

    public ChuNhat(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public ChuNhat(float a) {
        this.a = a;
        this.b = 1.0f;
    }

    public ChuNhat() {
        this.a = 1.0f;
        this.b = 1.0f;
    }

    public double chuVi() {
        return 2 * (this.a + this.b);
    }

    public double dienTich() {
        return this.a * this.b;
    }

    @Override
    public String toString() {
        return String.format("Hinh chu nhat co cac canh: a = %.2f, b = %.2f", this.a, this.b);
    }

}
