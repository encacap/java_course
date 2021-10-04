package bh4.bt2;

public class SanPham {

    private int ma;
    private String ten;
    private double donGia;
    private int soLuong;

    public SanPham(int ma, String ten, double donGia) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = 0;
    }

    public SanPham(int ma, String ten, double donGia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void themSoLuong(int soLuong) {
        this.soLuong += soLuong;
    }

    public int getMa() {
        return this.ma;
    }

    public String getTen() {
        return this.ten;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public double getTien() {
        return this.donGia * this.soLuong;
    }

    @Override
    public String toString() {
        return String.format("\t%d - %s - %.2f - %d", this.ma, this.ten, this.donGia, this.soLuong);
    }

}
