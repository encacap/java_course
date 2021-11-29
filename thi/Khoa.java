package thi;

import java.util.ArrayList;

public class Khoa implements IKhoa {

    private String ten;
    private ArrayList<Lop> danhSachLop;
    private Integer ma;
    private ArrayList<PhongThucHanh> danhSachPhongThucHanh;

    public Khoa(Integer maKhoa, String tenKhoa) {
        this.ma = maKhoa;
        this.ten = tenKhoa;
        this.danhSachLop = new ArrayList<Lop>();
        this.danhSachPhongThucHanh = new ArrayList<PhongThucHanh>();
    }

    @Override
    public void themLop(Lop lop) {
        if (this.timLop(lop.getMa()) == null) {
            this.danhSachLop.add(lop);
        }

    }

    @Override
    public void themPhongThucHanh(PhongThucHanh phongThucHanh) {
        if (this.timPhongThucHanh(phongThucHanh.getMa()) == null) {
            this.danhSachPhongThucHanh.add(phongThucHanh);
        }

    }

    @Override
    public PhongThucHanh timPhongThucHanh(Integer maPhong) {
        for (PhongThucHanh phongThucHanh : this.danhSachPhongThucHanh) {
            if (phongThucHanh.getMa() == maPhong) {
                return phongThucHanh;
            }
        }
        return null;
    }

    public Lop timLop(Integer ma) {
        for (Lop lop : this.danhSachLop) {
            if (lop.getMa() == ma) {
                return lop;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String results = String.format("Khoa %d - %s\n", this.ma, this.ten);
        results += "Danh sach lop:";
        for (Lop lop : this.danhSachLop) {
            results += "\n" + lop.toString();
        }
        results += "\nDanh sach phong thuc hanh:";
        for (PhongThucHanh phongThucHanh : this.danhSachPhongThucHanh) {
            results += "\n" + phongThucHanh.toString();
        }
        return results;
    }

    @Override
    public void themLichThucHanh(int maLop, String lichThucHanh) {
        Lop lop = this.timLop(maLop);
        for (PhongThucHanh phongThucHanh : this.danhSachPhongThucHanh) {
            phongThucHanh.setLop(lop, lichThucHanh);
        }
    }

}
