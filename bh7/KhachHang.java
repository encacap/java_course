package bh7;

public class KhachHang implements IListener {

	private String ten;
	private String diaChi;
	private int khaNangChiTra;

	public KhachHang(String ten, String diaChi, int khaNangChiTra) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.khaNangChiTra = khaNangChiTra;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String name) {
		this.ten = name;
	}

	public int getKhaNangChiTra() {
		return khaNangChiTra;
	}

	public void setKhaNangChiTra(int khaNangChiTra) {
		this.khaNangChiTra = khaNangChiTra;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public void tiepNhan(Event e) {
		System.out.println(ten + " da nhan duoc thong bao!");
		xuLy(e);
	}

	@Override
	public void xuLy(Event e) {
		if (e.getGiamgia() > 10 || e.getSp().getGiaTien() * e.getGiamgia() > 100000) {
			if (khaNangChiTra > e.getSp().daGiamGia(e.getGiamgia())) {
				System.out.println("Di mua ngay.");
			} else {
				System.out.println("O nha");
			}
		} else {
			System.out.println("O nha.");
		}
	}

}
