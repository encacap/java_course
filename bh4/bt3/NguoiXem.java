package bh4.bt3;

public class NguoiXem {

    private NguoiDung nguoiDung;
    private Video video;

    public NguoiXem(NguoiDung nguoiDung, Video video) {
        this.nguoiDung = nguoiDung;
        this.video = video;
    }

    @Override
    public String toString() {
        return String.format("Ten: %s - Video da xem: %s", this.nguoiDung.getTen(), this.video.getTen());
    }
}
