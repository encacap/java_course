package bh4.bt2;

import java.util.ArrayList;

public class CuaHang {

    private String ten;
    private ArrayList<SanPham> danhSachSanPham;
    private ArrayList<KhachHang> danhSachKhachHang;

    public CuaHang(String ten) {
        this.ten = ten;
        this.danhSachSanPham = new ArrayList<SanPham>();
        this.danhSachKhachHang = new ArrayList<KhachHang>();
    }

    public CuaHang() {
        this.ten = "Cua hang chua duoc dat ten";
        this.danhSachSanPham = new ArrayList<SanPham>();
        this.danhSachKhachHang = new ArrayList<KhachHang>();
    }

    public void themKhachHang(KhachHang khachHang) {
        this.danhSachKhachHang.add(khachHang);
    }

    public void themSanPham(SanPham sanPham, int soLuong) {
        sanPham.themSoLuong(soLuong);
        this.danhSachSanPham.add(sanPham);
    }

    public void tinhTien(KhachHang khachHang) {
        GioHang gioHang = khachHang.getGioHang();
        System.out.println(khachHang);
        System.out.println(String.format("Tong tien: %.2f VND", gioHang.getTien()));
    }

    public void banSanPham(GioHang gioHang) {
        ArrayList<SanPham> danhSachSanPhamDaBan = gioHang.getTatCaSanPham();
        for (SanPham sanPham : danhSachSanPhamDaBan) {
            this.banSanPham(sanPham);
        }
    }

    private void banSanPham(SanPham sanPham) {
        for (SanPham sanPhamTrongCuaHang : this.danhSachSanPham) {
            if (sanPhamTrongCuaHang.getMa() == sanPham.getMa()) {
                sanPhamTrongCuaHang.themSoLuong(-sanPham.getSoLuong());
            }
        }
    }

    @Override
    public String toString() {
        String result = String.format("Cua hang: %s", this.ten);
        result += "\nDanh sach san pham: ";
        for (SanPham sanPham : this.danhSachSanPham) {
            result += "\n" + sanPham.toString();
        }
        result += "\nDanh sach khach hang: ";
        for (KhachHang khachHang : this.danhSachKhachHang) {
            result += "\n" + khachHang.toString();
        }
        return result;
    }

}
