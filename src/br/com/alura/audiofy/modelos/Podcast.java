package br.com.alura.audiofy.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    // Métodos

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }


    // Getters e Setters

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
