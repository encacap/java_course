package bh4.bt3;

public class Client {
    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber("Nguyen Khac Khanh");
        NguoiDung nguoiDung = new NguoiDung("Nguyen Nguoi Xem");

        Video video = youtuber.taoVideo("Java crash course");
        Video video2 = youtuber.taoVideo("Java from zero to hero");

        nguoiDung.xemVideo(video);
        nguoiDung.xemVideo(video2);
        nguoiDung.inDanhSachVideoDaXem();
        printDivider();

        nguoiDung.xoaVideoDaXem(video);
        nguoiDung.inDanhSachVideoDaXem();
        printDivider();

        nguoiDung.xoaLichSuXem();

        nguoiDung.luuVideo(video);
        nguoiDung.inDanhSachVideoDaLuu();
        printDivider();

        youtuber.inDanhSachVideo();
        printDivider();

        youtuber.inDanhSachNguoiXem();
        printDivider();

        // System.out.println(youtuber);
        // System.out.println(nguoiXem);
    }

    private static void printDivider() {
        System.out.println("----------------------------------------------------");
    }
}
