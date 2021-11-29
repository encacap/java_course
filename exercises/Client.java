package exercises;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // Biến đổi cấu trúc lệnh lặp for thành lệnh lặp điều kiện trước bằng ví dụ cụ
        // thể
        // convertForToWhile();

        // Phân tích câu lệnh try .. catch
        // tryCatchExample();

        // Phân tích câu lệnh Switch case thành các câu lệnh if else
        // convertSwitchCaseToIfElse();

        // Xuất ra mã nhị phân của số nguyên dương n
        // convertToBinary(5);

        // Chuẩn hoá họ và tên
        // normalizeName();

        // Kiểm tra số nguyên tố
        // checkPrimeNumber();

        // Tính n!
        // factorial();

        // Tính tổng từ 1 đến n
        // sum();

        // Lớp bao
        // wrapper();

        // Đệ quy
        // Recursion deQuy = new Recursion();
        // System.out.println("Tổng 1 đến 5 (đệ quy): " + deQuy.sum(5));
        // System.out.println("Tổng 1 đến 5 (không đệ quy): " + deQuy.sumWithLoop(5));

        // Câu lệnh lặp
        // Loop cauLenhLap = new Loop();
        // cauLenhLap.forLoop();
        // cauLenhLap.forEachLoop();
        // cauLenhLap.whileLoop();
        // cauLenhLap.doWhileLoop();
    }

    private static void convertForToWhile() {
        int n = 5;
        int nWhile = n;
        int tongFor = 0;
        int tongWhile = 0;
        for (int i = 1; i <= n; i++) {
            tongFor += i;
        }
        System.out.println("Tổng 1 đến " + n + " (for): " + tongFor);
        while (nWhile > 0) {
            tongWhile += nWhile;
            nWhile--;
        }
        System.out.println("Tổng 1 đến " + n + " (while): " + tongWhile);
    }

    private static void tryCatchExample() {
        int soBiChia = 1;
        int soChia = 0;
        try {
            System.out.println("Thương là: " + soBiChia / soChia);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc phần chương trình");
        }
    }

    private static void convertSwitchCaseToIfElse() {
        int a = 2;
        switch (a % 2) {
            case 0:
                System.out.println("Số chẵn");
                break;

            default:
                System.out.println("Số lẻ");
                break;
        }
        if (a % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
    }

    private static void convertToBinary(int i) {
        System.out.println("Mã nhị phân của " + i + " là: " + Integer.toBinaryString(i));
    }

    private static void checkPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        if (isPrimeNumber(n)) {
            System.out.println("Số " + n + " là số nguyên tố");
        } else {
            System.out.println("Số " + n + " không phải là số nguyên tố");
        }
        scanner.close();
    }

    private static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void normalizeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String hoVaTen = scanner.nextLine();
        hoVaTen = hoVaTen.trim();
        hoVaTen = hoVaTen.replaceAll("\\s{2,}", " ").trim();
        String[] arrHoVaTen = hoVaTen.split(" ");
        for (int i = 0; i < arrHoVaTen.length; i++) {
            arrHoVaTen[i] = arrHoVaTen[i].substring(0, 1).toUpperCase() + arrHoVaTen[i].substring(1).toLowerCase();
        }
        hoVaTen = String.join(" ", arrHoVaTen);
        System.out.println("Họ và tên sau khi chuẩn hoá: " + hoVaTen);
        scanner.close();
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int ketQua = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                ketQua *= i;
            }
        }
        System.out.println(n + "! = " + ketQua);
        scanner.close();
    }

    private static void wrapper() {
        int soNguyen = 10;
        Integer lopSoNguyen = Integer.valueOf(soNguyen);
        System.out.println(lopSoNguyen);
        Integer autoboxing = soNguyen; // tự động chuyển đổi kiểu nguyên thuỷ thành kiểu đối tượng
        System.out.println(autoboxing);
    }

    private static void sum() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
        scanner.close();
    }
}
