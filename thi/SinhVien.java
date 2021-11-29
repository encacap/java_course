package thi;

public class SinhVien {

    private int ma;
    private String ten;

    public SinhVien(int maSV, String tenSV) {
        this.ma = maSV;
        this.ten = tenSV;
    }

    @Override
    public String toString() {
        return String.format("Sinh vien: %d - %s", this.ma, this.ten);
    }

    public int getMa() {
        return this.ma;
    }

    public void nhanLichThucHanh(PhongThucHanh phongThucHanh, String lichThucHanh) {
        System.out.println(String.format("Se di thuc hanh tai phong: %s vao %s", phongThucHanh.getTen(), lichThucHanh));
    }

}
