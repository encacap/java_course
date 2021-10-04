package bh4.bt3;

import java.util.ArrayList;

public class NguoiDung {

    private String ten;
    private ArrayList<Video> danhSachDaXem;
    private ArrayList<Video> danhSachDaLuu;

    public NguoiDung(String name) {
        this.ten = name;
        this.danhSachDaXem = new ArrayList<Video>();
        this.danhSachDaLuu = new ArrayList<Video>();
    }

    public void xemVideo(Video video) {
        this.danhSachDaXem.add(video);
        video.getKenh().themNguoiXem(this, video);
    }

    public String getTen() {
        return this.ten;
    }

    public void luuVideo(Video video) {
        this.danhSachDaLuu.add(video);
    }

    public void inDanhSachVideoDaXem() {
        System.out.println("Danh sach video da xem cua " + this.ten + ":");
        for (Video video : this.danhSachDaXem) {
            System.out.println(video);
        }
    }

    public void inDanhSachVideoDaLuu() {
        System.out.println("Danh sach video da luu cua " + this.ten + ":");
        for (Video video : this.danhSachDaLuu) {
            System.out.println(video);
        }
    }

    public void xoaVideoDaXem(Video video) {
        this.danhSachDaXem.remove(video);
    }

    public void xoaLichSuXem() {
        this.danhSachDaXem.clear();
    }

    public void xoaVideoDaLuu(Video video) {
        this.danhSachDaLuu.remove(video);
    }

    public void xoaTatCaVideoDaLuu() {
        this.danhSachDaLuu.clear();
    }

    @Override
    public String toString() {
        return String.format("Nguoi dung: %s\nSo luong video da xem: %d\nSo luong video da luu: %d", this.ten,
                this.danhSachDaXem.size(), this.danhSachDaLuu.size());
    }

}
