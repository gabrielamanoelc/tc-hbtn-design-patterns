public class AudioPlayer implements MediaPlayer {

    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if(tipoMedia.equals(TipoMedia.MP3)){
            System.out.println("Reproduzindo MP3: " + nomeArquivo);
        } else {
          this.mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
          mediaPlayerAdapter.reproduzir(tipoMedia, nomeArquivo);
        }

    }
}
