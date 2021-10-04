package bh4.bt1;

public class ChuNhat implements Hinh {

    private double b;
    private double a;

    public ChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ChuNhat(double a) {
        this.a = a;
        this.b = 1;
    }

    public ChuNhat() {
        this.a = 1;
        this.b = 1;
    }

    @Override
    public double chuVi() {
        return (this.a + this.b) * 2;
    }

    @Override
    public double dienTich() {
        return this.a * this.b;
    }
    
    @Override
    public String toString() {
    	return String.format("Hinh chu nhat (%.2f, %.2f) \nChu vi: %.2f\nDien tich: %.2f", this.a, this.b, this.chuVi(), this.dienTich());
    }
}
