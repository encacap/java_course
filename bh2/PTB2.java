package bh2;

public class PTB2 {

    private double a;
    private double b;
    private double c;

    public PTB2(double i, double j, double k) {
        this.a = i;
        this.b = j;
        this.c = k;
    }

    public Nghiem giai() {
        double d = this.delta();
        if (d >= 0)
            return new Nghiem((-b - Math.sqrt(d)) / (2 * a), (-b + Math.sqrt(d)) / (2 * a));
        return null;
    }

    private double delta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

}
