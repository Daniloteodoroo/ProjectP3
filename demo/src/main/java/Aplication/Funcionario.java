package Aplication;
public class Funcionario extends Pessoa {
    private double salario; 
    private String ocupacao; 

    
    public Funcionario(String nome, String cpf, String endereco, String telefone, double salario, String ocupacao) {
        super(nome, cpf, endereco, telefone); //RECEBE OS ATRIBUTOS DA CLASSE PESSOA
        this.salario = salario;
        this.ocupacao = ocupacao;
    }

    public String getNome() { //RETORNA O NOME DA PESSOA CADASTRADA
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() { //RETORNA O SALÁRIO ADICIONADO AO FUNCIONÁRIO
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getOcupacao() { //RETORNA A OCUPAÇÃO DO FUNCIONÁRIO (QUAL A SUA FUNÇÃO NA EMPRESA)
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }
}
