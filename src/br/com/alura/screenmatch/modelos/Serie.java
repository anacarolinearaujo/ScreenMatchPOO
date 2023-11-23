package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private int episodioPorTemporada;
    private boolean ativa;
    private int minPorEpisodio;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinPorEpisodio() {
        return minPorEpisodio;
    }

    public void setMinPorEpisodio(int minPorEpisodio) {
        this.minPorEpisodio = minPorEpisodio;
    }
}
