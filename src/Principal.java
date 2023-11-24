import br.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
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
        lost.setMinPorEpisodio(50);
        System.out.println("Duração em min " + lost.getDuracaoEmMinutos() );

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }
}
