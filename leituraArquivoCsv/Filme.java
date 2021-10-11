package br.com.letscode.java.leituraArquivoCsv;

public class Filme {
    private String imdbId;
    private String titulo;
    private int qtdVotos;
    private double pontuacao;

    public Filme(){}

    public Filme(String imdbId, String titulo, int qtdVotos, double pontuacao) {
        this.imdbId = imdbId;
        this.titulo = titulo;
        this.qtdVotos = qtdVotos;
        this.pontuacao = pontuacao;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQtdVotos() {
        return qtdVotos;
    }

    public double getPontuacao() {
        return pontuacao;
    }


    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setQtdVotos(int qtdVotos) {
        this.qtdVotos = qtdVotos;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }



    @Override
    public String toString() {
        return "Filme{" +
                "imdbId='" + imdbId + '\'' +
                ", titulo='" + titulo + '\'' +
                ", qtdVotos=" + qtdVotos +
                ", pontuacao=" + pontuacao +
                '}';
    }

}
