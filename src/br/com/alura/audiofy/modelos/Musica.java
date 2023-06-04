package br.com.alura.audiofy.modelos;

public class Musica extends Audio{
    private String artista;
    private String album;
    private String genero;

    // Métodos

    @Override
    public int getTotalReproducoes() {
        if (getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }


    // Getters e Setters


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
