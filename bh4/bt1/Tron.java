package bh4.bt1;

public class Tron implements Hinh {

    private double r;

    public Tron(double r) {
        this.r = r;
    }

    @Override
    public double chuVi() {
        return 2 * this.r * Math.PI;
    }

    @Override
    public double dienTich() {
        return Math.pow(this.r, 2) * Math.PI;
    }
    
    @Override
    public String toString() {
    	return String.format("Hinh tron ban kinh %.2f \nChu vi: %.2f\nDien tich: %.2f", this.r, this.chuVi(), this.dienTich());
    }
}
