package bh7;

public class Event {

	private String tenEvent;
	private String diaDiem;
	private SanPham sp;
	private int giamgia;

	public String getTenEvent() {
		return tenEvent;
	}

	public void setTenEvent(String tenEvent) {
		this.tenEvent = tenEvent;
	}

	public String getDiaDiem() {
		return diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	public SanPham getSp() {
		return sp;
	}

	public void setSp(SanPham sp) {
		this.sp = sp;
	}

	public int getGiamgia() {
		return giamgia;
	}

	public void setGiamgia(int giamgia) {
		this.giamgia = giamgia;
	}

	public Event(String tenEvent, String diaDiem, SanPham sp, int giamgia) {
		super();
		this.tenEvent = tenEvent;
		this.diaDiem = diaDiem;
		this.sp = sp;
		this.giamgia = giamgia;
	}

}
