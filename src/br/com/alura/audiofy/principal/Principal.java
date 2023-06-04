package br.com.alura.audiofy.principal;

import br.com.alura.audiofy.modelos.MinhasPreferidas;
import br.com.alura.audiofy.modelos.Musica;
import br.com.alura.audiofy.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++ ){
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcos Mendes");

        for (int i = 0; i < 5000; i++){
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }



}
