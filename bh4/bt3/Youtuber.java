package bh4.bt3;

import java.util.ArrayList;

public class Youtuber {

    private String ten;
    private ArrayList<Video> danhSachVideo;
    private ArrayList<NguoiXem> danhSachNguoiXem;

    public Youtuber(String ten) {
        this.ten = ten;
        this.danhSachVideo = new ArrayList<Video>();
        this.danhSachNguoiXem = new ArrayList<NguoiXem>();
    }

    public Video taoVideo(String tenVideo) {
        Video video = new Video(tenVideo, this);
        this.danhSachVideo.add(video);
        return video;
    }

    public String getTen() {
        return this.ten;
    }

    public void themNguoiXem(NguoiDung nguoiDung, Video video) {
        NguoiXem nguoiXem = new NguoiXem(nguoiDung, video);
        this.danhSachNguoiXem.add(nguoiXem);
    }

    public void inDanhSachVideo() {
        System.out.println("Danh sach video tren kenh cua " + this.ten);
        for (Video video : this.danhSachVideo) {
            System.out.println(video.getTen());
        }
    }

    public void inDanhSachNguoiXem() {
        System.out.println("Danh sach nguoi xem cua " + this.ten);
        for (NguoiXem nguoiXem : this.danhSachNguoiXem) {
            System.out.println(nguoiXem);
        }
    }

    @Override
    public String toString() {
        return String.format("Youtuber: %s\nSo luong video: %d\nSo luong nguoi xem: %d", this.ten,
                this.danhSachVideo.size(), this.danhSachNguoiXem.size());
    }

}
