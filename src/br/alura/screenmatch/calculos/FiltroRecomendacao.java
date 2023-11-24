package br.alura.screenmatch.calculos;
//Para recomendar os filmes mais assistidos
public class FiltroRecomendacao {
    //Atributos
    private String recomendacao;

    //Método
    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }

    }
}
