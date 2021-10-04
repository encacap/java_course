package bh3;

public class SanPham {

    private int maSP;
    private String tenSP;
    private int donGia;
    private int soLuongMua;

    public SanPham(int maSP, String tenSP, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        String format = "%d - Ten: %s - Don gia: %d - So luong mua: %d";
        return String.format(format, this.maSP, this.tenSP, this.donGia, this.soLuongMua);
    }

    public int getMa() {
        return this.maSP;
    }

    public int getGia() {
        return this.donGia;
    }

    public int getSoLuongMua() {
        return this.soLuongMua;
    }

    public void themSoLuongMua(int soLuong) {
        this.soLuongMua += soLuong;
    }

}
