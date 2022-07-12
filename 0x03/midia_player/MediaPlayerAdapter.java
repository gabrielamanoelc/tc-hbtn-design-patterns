public class MediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;


    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if(!tipoMedia.equals(TipoMedia.MP3)){
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        advancedMediaPlayer.reproduzirVlc(nomeArquivo);
    }
}
