public class VideoMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void reproduzirVlc(String nomeVideoVlc) {
        System.out.printf("Reproduzindo VLC: %s", nomeVideoVlc);
    }

    @Override
    public void reproduzirMp4(String nomeVideoMP4) {
        System.out.printf("Reproduzindo MP4: %s", nomeVideoMP4);
    }
}
