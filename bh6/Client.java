package bh6;

public class Client {
    public static void main(String[] args) {
        ICuaHang cuaHang = new CuaHang("Cua hang cua Nguyen Khac Khanh");

        KhachHang khachHang1 = new KhachHang(1, "Nguyen Van A");

        SanPham banh = new SanPham(1, "Banh Oreo", 1000);
        SanPham keo = new SanPham(2, "Keo", 2000);

        cuaHang.themMatHang(banh);
        cuaHang.themMatHang(keo);

        cuaHang.themKhachHang(khachHang1);
    }
}
