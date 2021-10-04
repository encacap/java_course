package bh2;

public class PhanSo {

    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu) {
        this.tu = tu;
        this.mau = 1;
    }

    public PhanSo cong(PhanSo a) {
        return new PhanSo(this.tu * a.mau + this.mau * a.tu, this.mau * a.mau).rutGon();
    }

    private PhanSo rutGon() {
        int u = this.ucln(this.tu, this.mau);
        this.tu = this.tu / u;
        this.mau = this.mau / u;
        return new PhanSo(this.tu, this.mau);
    }

    private int ucln(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }

    @Override
    public String toString() {
        if (this.mau != 1)
            return String.format("%s/%s", this.tu, this.mau);
        return String.format("%s", this.tu);
    }

}
