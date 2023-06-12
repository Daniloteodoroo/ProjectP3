package Aplication;
public class Pessoa {
    private String cpf;
    private String endereco;
    private String telefone;
    protected String nome;

    public Pessoa(String cpf, String endereco, String telefone, String nome) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getCpf() { //RETORNA O CPF DA PESSOA CADASTRADA
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() { //RETORNA O ENDEREÇO DA PESSOA CADASTRADA
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() { //RETORNA O TELEFONE DA PESSOA CADASTRADA
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNome() { //RETORNA O NOME DA PESSOA CADASTRADA
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}