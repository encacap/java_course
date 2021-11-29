package thi;

public class Client {
    public static void main(String[] args) {
        IKhoa khoaCNTT = new Khoa(1, "CNTT");

        Lop lopCN18A = new Lop(1, "CN18A");
        Lop lopCN18B = new Lop(2, "CN18B");

        PhongThucHanh phongThucHanhH005 = new PhongThucHanh(3, "Phong thuc hanh H005");

        SinhVien khanh = new SinhVien(1, "Nguyen Khac Khanh");
        SinhVien nguyen = new SinhVien(2, "Nguyen Van Nguyen");
        SinhVien huy = new SinhVien(3, "Nguyen Van Huy");

        lopCN18A.themSinhVien(khanh);
        lopCN18A.themSinhVien(nguyen);

        lopCN18B.themSinhVien(huy);

        khoaCNTT.themLop(lopCN18A);
        khoaCNTT.themPhongThucHanh(phongThucHanhH005);

        khoaCNTT.themLichThucHanh(1, "Thu hai");

        System.out.println(khoaCNTT.timLop(1));

        System.out.println(khoaCNTT);
    }
}
