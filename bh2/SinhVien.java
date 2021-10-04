package bh2;

public class SinhVien {

    private int ma;
    private String ten;
    private float diem;

    public SinhVien(int ma, String ten, float diem) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
    }

    public int getMa() {
        return this.ma;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %.2f", ma, ten, diem);
    }

}
