/**
 * Created by Usuario on 22/01/2017.
 */
public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789.10";

        Livro outrolivro = new Livro();
        outrolivro.nome = "Lógica de Programação";
        outrolivro.descricao = "Crie seus primeiros programas";
        outrolivro.valor = 59.90;
        outrolivro.isbn = "978-85-66250-22-0";

       outrolivro.autor = outroAutor;

        outrolivro.mostrarDetalhes();
    }
}
