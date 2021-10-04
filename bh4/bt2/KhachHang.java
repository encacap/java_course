package bh4.bt2;

public class KhachHang {

    private int ma;
    private String ten;
    private GioHang gioHang;

    public KhachHang(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.gioHang = new GioHang();
    }

    public void muaHang(SanPham sanPham) {
        SanPham sanPhamKhachHangMua = new SanPham(sanPham.getMa(), sanPham.getTen(), sanPham.getDonGia(), 1);
        this.gioHang.themSanPham(sanPhamKhachHangMua);
    }

    public void muaHang(SanPham sanPham, int i) {
        SanPham sanPhamKhachHangMua = new SanPham(sanPham.getMa(), sanPham.getTen(), sanPham.getDonGia(), i);
        this.gioHang.themSanPham(sanPhamKhachHangMua);
    }

    public GioHang getGioHang() {
        return this.gioHang;
    }

    public void thanhToan(CuaHang cuaHang) {
        cuaHang.banSanPham(this.gioHang);
    }

    @Override
    public String toString() {
        String result = "";
        result += String.format("%d - %s", this.ma, this.ten);
        if (this.gioHang.tinhSoLuongSanPham() > 0) {
            result += "\n\t" + this.gioHang.toString();
        }
        return result;
    }

}
