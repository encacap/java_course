package bh2;

import java.util.ArrayList;

public class LopHoc {

    private ArrayList<SinhVien> danhSachSinhVien;

    public LopHoc() {
        this.danhSachSinhVien = new ArrayList<SinhVien>();
    }

    public void them(SinhVien sinhVienMoi) {
        // Kiểm tra nếu mã sinh viên chưa tồn tại mới thêm
        for (SinhVien sinhVien : this.danhSachSinhVien) {
            if (sinhVien.getMa() == sinhVienMoi.getMa()) {
                return;
            }
        }
        this.danhSachSinhVien.add(sinhVienMoi);
    }

    public SinhVien tim(int ma) {
        for (SinhVien sinhVien : this.danhSachSinhVien) {
            if (sinhVien.getMa() == ma) {
                return sinhVien;
            }
        }
        return null;
    }

    public SinhVien tim(String ten) {
        for (SinhVien sinhVien : this.danhSachSinhVien) {
            if (sinhVien.getTen() == ten) {
                return sinhVien;
            }
        }
        return null;
    }

    public void xoa(int ma) {
        this.danhSachSinhVien.remove(this.tim(ma));
    }

    public void xoa() {
        this.danhSachSinhVien.clear();
    }

    @Override
    public String toString() {
        String string = "";
        for (SinhVien sinhVien : this.danhSachSinhVien) {
            string += sinhVien + "\n";
        }
        return string;
    }

}
