package bh7;

import java.util.ArrayList;

public class SieuThi implements IGenerator {

	String ten;
	private ArrayList<KhachHang> listKH;
	private ArrayList<KhachHang> listDK;

	public SieuThi(String ten) {
		this.ten = ten;
		listKH = new ArrayList<KhachHang>();
		listDK = new ArrayList<KhachHang>();
	}

	@Override
	public void thongBao(Event e) {
		for (KhachHang kh : listDK) {
			if (e.getDiaDiem().equals(kh.getDiaChi())) {
				System.out.println(kh.getTen());
				kh.tiepNhan(e);
			}
		}
	}

	@Override
	public void khuyenMai(Event e) {
		if (!listDK.isEmpty()) {
			thongBao(e);
		}
	}

	@Override
	public void dangKy(IListener listener) {
		if (listKH.contains(listener)) {
			listDK.add((KhachHang) listener);
		} else {
			listKH.add((KhachHang) listener);
			listDK.add((KhachHang) listener);
		}
	}

}
