package bh4.bt3;

public class Video {

    private String ten;
    private Youtuber kenh;

    public Video(String ten, Youtuber youtuber) {
        this.ten = ten;
        this.kenh = youtuber;
    }

    public Youtuber getKenh() {
        return kenh;
    }

    public String getTen() {
        return this.ten;
    }

    @Override
    public String toString() {
        return String.format("Video: %s - Tao boi: %s", this.ten, this.kenh.getTen());
    }

}
