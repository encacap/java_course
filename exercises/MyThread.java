package exercises;

public class MyThread extends Thread {
    @Override
    public void run() { // myThread thuc su chay
        System.out.println("Day la MyThread!");
        super.run();
    }
}
