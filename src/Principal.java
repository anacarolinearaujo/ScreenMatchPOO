import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //Istanciar objeto
        //tipo refernencia
        Filme meuFilme = new Filme();
        //alterando informações com set
        meuFilme.setNome("O podereso chefão");
        meuFilme.setAnoLancamento( 1970);
        meuFilme.setDuracaoEmMinutos(180);

        //mostrando informações com get
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Média de avações: " + meuFilme.pegaMedia());

    }
}
