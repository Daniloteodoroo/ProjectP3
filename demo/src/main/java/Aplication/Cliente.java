package Aplication;

public class Cliente extends Pessoa {
    private double valorDevido; 

    public Cliente(String cpf, String endereco, String telefone, double valorDevido, String nome) {

        super(cpf, endereco, telefone, nome); //RECEBE OS ATRIBUTOS DA CLASSE PESSOA
        this.valorDevido = valorDevido; 
    }

    public double getValorDevido() { //RETORNA O VALOR DEVIDO
        return valorDevido;
    }

    public void setValorDevido(double divida) {  //VALOR DEVIDO MAIS OS JUROS
        this.valorDevido = divida;
    }
}
