/**
 * Created by Usuario on 22/01/2017.
 */
public class Livro {

    //Declarações

    String nome;
    String descricao;
    double valor;
    String isbn;

    //Métodos

    public void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome:" + nome);
        System.out.println("Descrição:" + descricao);
        System.out.println("Valor:" + valor);
        System.out.println("ISBN:" + isbn);
        System.out.println("-----------------------");
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



}
