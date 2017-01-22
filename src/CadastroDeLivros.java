/**
 * Created by Usuario on 22/01/2017.
 */
public class CadastroDeLivros {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.mostrarDetalhes();

        Livro outrolivro = new Livro();
        outrolivro.nome = "Lógica de Programação";
        outrolivro.descricao = "Crie seus primeiros programas";
        outrolivro.valor = 59.90;
       outrolivro.isbn = "978-85-66250-22-0";

        outrolivro.mostrarDetalhes();
    }
}
