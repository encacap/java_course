package thi;

import java.util.ArrayList;

public class PhongThucHanh {

    private int ma;
    private String ten;
    private ArrayList<Lop> danhSachLop;
    private ArrayList<String> danhSachLichThucHanh;

    public PhongThucHanh(int maPhong, String tenPhong) {
        this.ma = maPhong;
        this.ten = tenPhong;
        this.danhSachLop = new ArrayList<Lop>();
        this.danhSachLichThucHanh = new ArrayList<String>();
    }

    public Integer getMa() {
        return this.ma;
    }

    public void themLop(Lop lop, String chiTiet) {
        this.danhSachLop.add(lop);
        lop.nhanLichThucHanh(this, chiTiet);
    }

    @Override
    public String toString() {
        return String.format("Phong thuc hanh %d - %s", this.ma, this.ten);
    }

    public void setLop(Lop lop, String lichThucHanh) {
        if (!this.timLich(lop, lichThucHanh)) {
            this.danhSachLop.add(lop);
            this.danhSachLichThucHanh.add(lichThucHanh);
            lop.nhanLichThucHanh(this, lichThucHanh);
        }
    }

    synchronized private boolean timLich(Lop lop, String lichThucHanh) {
        if (this.danhSachLichThucHanh == null)
            return false;
        for (int i = 0; i < this.danhSachLichThucHanh.size(); i++) {
            if (this.danhSachLichThucHanh.get(i).equals(lichThucHanh)) {
                return true;
            }
        }
        return false;
    }

    public String getTen() {
        return this.ten;
    }
}
