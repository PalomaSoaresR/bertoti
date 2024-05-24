package com.example;

public class Tweet {
    private String conteudo;
    private String dataHora;

    public Tweet(String conteudo, String dataHora) {
        this.conteudo = conteudo;
        this.dataHora = dataHora;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
