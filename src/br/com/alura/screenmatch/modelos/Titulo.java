package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Atributos
    private String nome;
    private int anoLancamento;
    private boolean incluido;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    //Métodos Getter and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluido() {
        return incluido;
    }

    public void setIncluido(boolean incluido) {
        this.incluido = incluido;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Método publicos
    public void exibeFichaTecnica() {
        System.out.println("Nome do fime: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Incluido no blano: " + incluido);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;

    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
