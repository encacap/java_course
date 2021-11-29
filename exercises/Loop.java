package exercises;

public class Loop {

    public void forLoop() {
        System.out.println("Vòng lặp FOR thường");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    public void forEachLoop() {
        int[] numbers = { 1, 2, 3 };
        System.out.println("Vòng lặp FOR EACH");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void whileLoop() {
        System.out.println("Vòng lặp WHILE");
        int i = 0;
        while (i > 0) {
            System.out.println(i);
            i++;
        }
    }

    public void doWhileLoop() {
        System.out.println("Vòng lặp DO WHILE");
        int i = 0;
        do {
            System.out.println(i);
        } while (i > 0);
    }

}
