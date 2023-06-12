package CubeTypes;

public class nxnxn {

    private int quantity;
    private double price;

    public nxnxn() {
        quantity = 0;
        price = 0;
    }

    public void Add(int quantity) { //MÉTODO PARA ADICIONAR UM CUBO NXNXN
        this.quantity += quantity;
    }

    public int Remove(int quantity) { //MÉTODO PARA REMOVER UM CUBO NXNXN
        if (this.quantity - quantity < 0) { //CONDIÇÃO CASO A QUANTIDADE DE CUBO A SER REMOVIDO SEJA MENOR QUE A QUANTIDADE DE CUBOS NO ESTOQUE 
            return -1;
        } else {
            this.quantity -= quantity;
            return quantity;
        }
    }

    public int getQuantity() {  //RETORNA A QUANTIDADE DE CUBOS NXNXN
        return quantity;
    }

    public double addPrice (double price){
        return this.price = price;
    }

    public double getPrice (){ //RETORNA O PREÇO DO CUBO NXNXN
        return price;
    }
}
