package bh4.bt1;

public class Client {
    public static void main(String[] args) {
        Hinh chuNhat = new ChuNhat(20.0, 30.0);
        Hinh tron = new Tron(5.0);
        Hinh tamGiac = new TamGiac(4.0, 2.0, 3.0);

        System.out.println(chuNhat);
        printLine();
        System.out.println(tron);
        printLine();
        System.out.println(tamGiac);
    }

    private static void printLine() {
        System.out.println("---------------------------------------------");
    }
}
