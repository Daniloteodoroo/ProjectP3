package Aplication;
public class Funcionario extends Pessoa {
    private double salario; 
    private String ocupacao; 

    
    public Funcionario(String nome, String cpf, String endereco, String telefone, double salario, String ocupacao) {
        super(nome, cpf, endereco, telefone);
        this.salario = salario;
        this.ocupacao = ocupacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
