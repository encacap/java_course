package bh2;

public class Client {
    public static void main(String[] args) {
        IHinh chuNhat = new ChuNhat(5, 7);
        System.out.println(chuNhat.tinhChuVi());
    }
}
