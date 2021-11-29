package exercises;

public class Money {

    private int tong;

    public Money(int tong) {
        this.tong = tong;
    }

    public void use(String name, int money) {
        synchronized (this) {
            if (tong >= money) {
                System.out.println(name + ": tieu " + money + " VND");
                tong -= money;
                System.out.println("Con lai: " + tong);
            } else {
                System.out.println(name + ": khong con tien de tieu :((");
                System.out.println("Con lai: " + tong);
            }
        }
    }

}
