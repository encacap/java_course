package bh7;

public class SanPham {

	private String ten;
	private int giaTien;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}

	public SanPham(String ten, int giaTien) {
		super();
		this.ten = ten;
		this.giaTien = giaTien;
	}

	public int daGiamGia(int giamGia) {
		return this.giaTien * (100 - giamGia) / 100;
	}

}
