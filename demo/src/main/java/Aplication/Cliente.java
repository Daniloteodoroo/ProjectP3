package Aplication;

public class Cliente extends Pessoa {
    private double valorDevido; 

    public Cliente(String cpf, String endereco, String telefone, double valorDevido, String nome) {
        super(cpf, endereco, telefone, nome);
        this.valorDevido = valorDevido;
    }

    public double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(double divida) {
        this.valorDevido = divida;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cliente that = (Cliente) obj;
        return that.getCpf().equals(this.getCpf());
    }
}
