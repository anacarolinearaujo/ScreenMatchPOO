import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //Istanciar objeto
        //tipo refernencia
        Filme meuFilme = new Filme();
        //alterando informações de Filmes com set
        meuFilme.setNome("O podereso chefão");
        meuFilme.setAnoLancamento( 1970);
        meuFilme.setDuracaoEmMinutos(180);

        //mostrando informações dos Filmes com get
         meuFilme.exibeFichaTecnica();
         meuFilme.avalia(9);
         meuFilme.avalia(8);
         meuFilme.avalia(9);

         System.out.println("Média de avações: " + meuFilme.pegaMedia());

         //Instanciando Série
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(200);
        lost.exibeFichaTecnica();
        lost.setTemporada(10);
        lost.setEpisodioPorTemporada(10);

    }
}
