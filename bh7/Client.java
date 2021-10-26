package bh7;

public class Client {

	public static void main(String[] args) {
		IGenerator coopmart = new SieuThi("Coop mart");
		IListener a = new KhachHang("Nguyen Khac Khanh", "HCM", 1000000);
		IListener b = new KhachHang("Nguyen Thi B", "HCM", 100);
		IListener c = new KhachHang("Tran Van C", "HN", 20000000);
		SanPham sp = new SanPham("Noi Inox", 300000);
		Event e = new Event("Deal soc", "HCM", sp, 20);
		coopmart.dangKy(a);
		coopmart.dangKy(b);
		coopmart.dangKy(c);
		coopmart.khuyenMai(e);
	}
}
