package thi;

public interface IKhoa {
    void themPhongThucHanh(PhongThucHanh phongThucHanh);

    PhongThucHanh timPhongThucHanh(Integer maPhong);

    void themLop(Lop lop);

    Lop timLop(Integer maLop);

    void themLichThucHanh(int maLop, String lichThucHanh);
}
