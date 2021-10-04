package bh2;

public class TamGiac {
    public float a, b, c;

    public TamGiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double chuVi() {
        return a + b + c;
    }

    public double dienTich() {
        double nuaChuVi = chuVi() / 2;
        return (float) Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));
    }

    @Override
    public String toString() {
        return String.format("Tam giac co cac canh: a = %.2f, b = %.2f, c = %.2f", a, b, c);
    }
}
