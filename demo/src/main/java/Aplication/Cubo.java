package Aplication;
public class Cubo {
    private String nome; //ATRIBUTO PARA ATRIBUIR O NOME DO CUBO
    private double valor; //ATRIBUTO PARA DAR UM VALOR DO CUBO
    private int quantidade; //ATRIBUTO PARA INFORMAR A QUANTIDADE DE CUBO

    public Cubo(String nome, double valor, int quantidade) {
        this.nome = nome; 
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Getters e Setters

    public String getNome() { //RETORNA O NOME DO CUBO
        return nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    }

    public double getValor() { //RETORNA O VALOR DO CUBO
        return valor;
    }

    public void setValor(double valor) { 
        this.valor = valor;
    }

    public int getQuantidade() { //RETORNA A QUANTIDADE DE CUBO
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int quantidade) { //MÉTODO PARA INSERIR MAIS CUBOS AO ESTOQUE 
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) { //MÉTODO PARA REMOVER CUBOS DO ESTOQUE 
        if (this.quantidade >= quantidade) { //CONDIÇÃO CASO A QUANTIDADE DE CUBOS A SER REMOVIDO SEJA MAIOR QUE A QUANTIDADE DE CUBOS NO ESTOQUE
            this.quantidade -= quantidade;
        } else {
            System.out.println("Não há quantidade suficiente de cubos.");
        }
    }
}