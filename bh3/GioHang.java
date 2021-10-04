package bh3;

import java.util.ArrayList;

public class GioHang implements IGioHang {

    ArrayList<SanPham> danhSachSanPham;

    public GioHang() {
        this.danhSachSanPham = new ArrayList<SanPham>();
    }

    @Override
    public void them(SanPham sanPham, int soLuong) {
        sanPham.themSoLuongMua(soLuong);

        for (SanPham i : danhSachSanPham) {
            if (i.getMa() == sanPham.getMa()) {
                i = sanPham;
                return;
            }
        }

        danhSachSanPham.add(sanPham);
    }

    @Override
    public void hienThi() {
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }

    @Override
    public int tongTien() {
        int tong = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tong += sanPham.getGia() * sanPham.getSoLuongMua();
        }
        return tong;
    }

    @Override
    public int soMatHang() {
        return danhSachSanPham.size();
    }

    @Override
    public int soSanPham() {
        int tongSoSanPham = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tongSoSanPham += sanPham.getSoLuongMua();
        }
        return tongSoSanPham;
    }

}
