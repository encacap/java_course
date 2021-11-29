package thi;

import java.util.ArrayList;

public class Lop {

    private String ten;
    private ArrayList<SinhVien> danhSachSinhVien;
    private Integer ma;

    public Lop(Integer maLop, String tenLop) {
        this.ma = maLop;
        this.ten = tenLop;
        this.danhSachSinhVien = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sinhVien) {
        if (!this.timSinhVien(sinhVien.getMa())) {
            this.danhSachSinhVien.add(sinhVien);
        }
    }

    private boolean timSinhVien(int maSV) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMa() == maSV) {
                return true;
            }
        }
        return false;
    }

    public Integer getMa() {
        return this.ma;
    }

    @Override
    public String toString() {
        return String.format("Lop %d - %s (%d sinh vien)", this.ma, this.ten, this.danhSachSinhVien.size());
    }

    public void nhanLichThucHanh(PhongThucHanh phongThucHanh, String lichThucHanh) {
        for (SinhVien sinhVien : this.danhSachSinhVien) {
            sinhVien.nhanLichThucHanh(phongThucHanh, lichThucHanh);
        }
    }

}
