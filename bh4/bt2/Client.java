package bh4.bt2;

public class Client {
    public static void main(String[] args) {
        CuaHang cuaHang = new CuaHang();
        KhachHang khachHang = new KhachHang(1, "Nguyen Khac Khanh");
        SanPham sanPham1 = new SanPham(1, "Dien thoai", 1000000);
        SanPham sanPham2 = new SanPham(2, "Laptop", 2000000);

        cuaHang.themSanPham(sanPham1, 20);
        cuaHang.themSanPham(sanPham2, 50);

        cuaHang.themKhachHang(khachHang);
        cuaHang.themKhachHang(new KhachHang(2, "Nguyen Van A"));
        cuaHang.themKhachHang(new KhachHang(3, "Nguyen Thi B"));

        khachHang.muaHang(sanPham1);
        khachHang.muaHang(sanPham2, 10);

        System.out.println(cuaHang);
        printLine();

        cuaHang.tinhTien(khachHang);

        // Làm sạch giỏ hàng.
        // Đống thời giảm số lượng sản phẩm trong cửa hàng.
        khachHang.thanhToan(cuaHang);

        printLine();
        System.out.println(cuaHang);
    }

    private static void printLine() {
        System.out.println("----------------------------------------------------");
    }
}
