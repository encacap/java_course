package bh4.bt2;

import java.util.ArrayList;

public class GioHang {
    private ArrayList<SanPham> danhSachSanPham;

    public GioHang() {
        this.danhSachSanPham = new ArrayList<SanPham>();
    }

    public void themSanPham(SanPham sanPham) {
        for (SanPham sp : danhSachSanPham) {
            if (sp.getMa() == sanPham.getMa()) {
                sp.themSoLuong(sanPham.getSoLuong());
                return;
            }
        }
        this.danhSachSanPham.add(sanPham);
    }

    public int tinhSoLuongSanPham() {
        return this.danhSachSanPham.size();
    }

    public double getTien() {
        double tien = 0;
        for (SanPham sp : danhSachSanPham) {
            tien += sp.getTien();
        }
        return tien;
    }

    public ArrayList<SanPham> getTatCaSanPham() {
        return this.danhSachSanPham;
    }

    @Override
    public String toString() {
        String result = "\t";
        for (SanPham sanPham : danhSachSanPham) {
            result += sanPham.toString() + "\n";
        }
        return result.trim();
    }

}
