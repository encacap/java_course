package bh4.bt1;

public class TamGiac implements Hinh {

    private double a;
    private double b;
    private double c;

    public TamGiac(double a, double b, double c) {
        if (!this.kiemTra(a, b, c)) {
            throw new IllegalArgumentException("Khong phai tam giac");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean kiemTra(double x, double y, double z) {
        return (x + y > z) && (x + z > y) && (y + z > x);
    }

    @Override
    public double chuVi() {
        return this.a + this.b + this.c;
    }

    @Override
    public double dienTich() {
        double nuaChuVi = this.chuVi() / 2;
        return Math.sqrt(nuaChuVi * (nuaChuVi - this.a) * (nuaChuVi - this.b) * (nuaChuVi - this.c));
    }

    @Override
    public String toString() {
    	return String.format("Hinh tam giac (%.2f, %.2f, %.2f)\nChu vi: %.2f\nDien tich:%.2f", this.a, this.b, this.c, this.chuVi(), this.dienTich());
    }
}
