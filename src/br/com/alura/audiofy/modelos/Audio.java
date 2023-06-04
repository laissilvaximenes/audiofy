package br.com.alura.audiofy.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    // Metódos

    public void curte (){
        this.totalCurtidas ++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
