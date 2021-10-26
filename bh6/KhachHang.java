package bh6;

public class KhachHang {

    private Integer ma;
    private String name;
    private GioHang gioHang;

    public KhachHang(Integer ma, String name) {
        this.ma = ma;
        this.name = name;
        this.gioHang = new GioHang();
    }

    public Integer getMa() {
        return this.ma;
    }

    public String toString() {
        return String.format("%d - %s", this.ma, this.name);
    }

}
