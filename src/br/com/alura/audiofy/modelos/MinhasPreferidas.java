package br.com.alura.audiofy.modelos;

public class MinhasPreferidas extends Audio{

    // Métodos
    public void inclui (Audio audio){
        if (getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto e preferido por todos!");
        } else{
            System.out.println(audio.getTitulo() + " Também é um dos que todo mundo está curtindo");
        }
    }
}
