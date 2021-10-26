package bh6;

import java.util.ArrayList;

public class CuaHang implements ICuaHang {

    private String name;
    private ArrayList<SanPham> danhSachSanPham;
    private ArrayList<KhachHang> danhSachKhachHang;

    public CuaHang(String name) {
        this.name = name;
        this.danhSachSanPham = new ArrayList<SanPham>();
        this.danhSachKhachHang = new ArrayList<KhachHang>();
    }

    @Override
    public void themMatHang(SanPham sanPhamMoi) {
        if (this.timMatHang(sanPhamMoi.getMa()) != null)
            return;
        this.danhSachSanPham.add(sanPhamMoi);
    }

    @Override
    public SanPham timMatHang(Integer maSanPham) {
        for (SanPham sanPham : this.danhSachSanPham) {
            if (sanPham.getMa().equals(maSanPham))
                return sanPham;
        }
        return null;
    }

    @Override
    public void themKhachHang(KhachHang khachHangMoi) {
        if (this.timKhachHang(khachHangMoi) != null)
            return;
        this.danhSachKhachHang.add(khachHangMoi);
    }

    @Override
    public KhachHang timKhachHang(KhachHang khachHangCanTim) {
        for (KhachHang khachHang : this.danhSachKhachHang) {
            if (khachHang.getMa().equals(khachHangCanTim.getMa()))
                return khachHang;
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }

}
