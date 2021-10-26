package bh6;

public class SanPham {

    private int ma;
    private String ten;
    private int donGia;

    public SanPham(int ma, String ten, int donGia) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
    }

    public Integer getMa() {
        return this.ma;
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %.2f ", this.ma, this.ten, this.donGia);
    }

}
