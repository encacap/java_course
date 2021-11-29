package exercises;

public class Recursion {

    public int sum(int i) {
        if (i <= 0) {
            return 0;
        }
        return i + sum(i - 1);
    }

    public int sumWithLoop(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i;
            i--;
        }
        return sum;
    }

}
