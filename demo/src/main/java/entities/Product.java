package entities;

import CubeTypes.*;

public class Product extends CubeRental {

    public String type;
    public double price;
    public nxnxn[] nxnxn; // [0] - 2x2 [1] - 3x3 [2] - 4x4
    private otherPuzzels otherPuzzels;

    public Product() { //CONTRUTOR PARA CHAMAR A CLASSE (NXNXN) E (OTHERPUZZLES)

        otherPuzzels = new otherPuzzels();
        nxnxn = new nxnxn[3];
        for (int i = 0; i < nxnxn.length; i++) {
            nxnxn[i] = new nxnxn();
        }
    }

    public int get2x2(){ //RETORNA A QUANTIDADE DE CUBOS DO TIPO 2X2
        return nxnxn[0].getQuantity();
    }

    public int get3x3(){ //RETORNA A QUANTIDADE DE CUBOS DO TIPO 3X3
        return nxnxn[1].getQuantity();
    }

    public int get4x4(){ //RETORNA A QUANTIDADE DE CUBOS DO TIPO 4XX4
        return nxnxn[2].getQuantity();
    }

    public int getOther(){ //RETORNA A QUANTIDADE DE CUBOS DO TIPO OTHER
        return otherPuzzels.getQuantity();
    }

    // VALOR TOTAL DE CADA TIPO DO CUBO (NXNXN)

    public double totalValueInNxnxn2x2() { 
        return nxnxn[0].getQuantity() * nxnxn[0].getPrice(); //QUANTIDADE X O VALOR DO CUBO
    }

    public double totalValueInNxnxn3x3() {
        return nxnxn[1].getQuantity() * nxnxn[1].getPrice(); //QUANTIDADE X O VALOR DO CUBO
    }

    public double totalValueInNxnxn4x4() {
        return nxnxn[2].getQuantity() * nxnxn[2].getPrice(); //QUANTIDADE X O VALOR DO CUBO
    }

    // VALOR TOTAL DO CUBO (OTHERPUZZELS)

    public double totalValueInOtherPuzzels() {
        return otherPuzzels.getQuantity() * otherPuzzels.getPrice(); //QUANTIDADE X O VALOR DO CUBO
    }

    // --------------------------------------------------------------------------------------//

    // ADICIONAR A QUANTIDADE DE CADA TIPO DO CUBO (NXNXN)

    public int addProductsInNxnxn2x2(int quantity) {
        nxnxn[0].Add(quantity); //MÉTODOD ADICIONAR DA CLASSE NXNXN COLOCANDO A QUANTIDADE QUE DESEJA COMO PARÂMETRO
        return nxnxn[0].getQuantity();
    }

    public int addProductsInNxnxn3x3(int quantity) {
        nxnxn[1].Add(quantity);
        return nxnxn[1].getQuantity();
    }

    public int addProductsInNxnxn4x4(int quantity) {
        nxnxn[2].Add(quantity);
        return nxnxn[2].getQuantity();
    }

    // ADICIONAR A QUANTIDADE DO CUBO (OTHERPUZZELS)

    public int addProductsInOtherPuzzels(int quantity) {
        otherPuzzels.Add(quantity);
        return otherPuzzels.getQuantity();
    }

    // --------------------------------------------------------------------------------------//

    // REMOVER A QUANTIDADE DE CADA TIPO DO CUBO (NXNXN)

    public void removeProductsNxnxn2x2(int quantity) {
        nxnxn[0].Remove(quantity); //MÉTODOD REMOVER DA CLASSE NXNXN COLOCANDO A QUANTIDADE QUE DESEJA COMO PARÂMETRO
    }

    public void removeProductsNxnxn3x3(int quantity) {
        nxnxn[1].Remove(quantity);
    }

    public void removeProductsNxnxn4x4(int quantity) {
        nxnxn[2].Remove(quantity);
    }

    // REMOVER A QUANTIDADE DO CUBO (OTHERPUZZELS)

    public void removeOtherPuzzels(int quantity) {
        otherPuzzels.Remove(quantity);
    }

    // --------------------------------------------------------------------------------------//

    // ATUALIZAR O PREÇO DE CADA TIPO DE CUBO (NXNXN)

    public double upDatePriceNxnxn2x2(double price) {
        nxnxn[0].addPrice(price);
        return nxnxn[0].getPrice();
    }

    public double upDatePriceNxnxn3x3(double price) {
        nxnxn[1].addPrice(price);
        return nxnxn[1].getPrice();
    }

    public double upDatePriceNxnxn4x4(double price) {
        nxnxn[2].addPrice(price);
        return nxnxn[2].getPrice();
    }

    // ATUALIZAR O PREÇO DE CADA DO CUBO CUBO (OTHERPUZZELS)

    public double upDatePriceOtherPuzzels(double price) {
        otherPuzzels.addPrice(price);
        return otherPuzzels.getPrice();
    }

    // --------------------------------------------------------------------------------------//

    // METODOS toString (NXNXN) && (OTHERPUZZELS)

    public String nxnxnQuantity2x2() {
        return type //TIPO DE CUBO
                + "(2x2), $"
                + String.format("%.2f", nxnxn[0].getPrice()) //VALOR DO CUBO
                + ", "
                + nxnxn[0].getQuantity() + " units, Total: $" //QUANTIDADE DE CUBOS NO ESTOQUE 
                + String.format("%.2f", totalValueInNxnxn2x2()); //VALOR TOTAL 
    } 

    public String nxnxnQuantity3x3() {
        return type
                + "(3x3), $"
                + String.format("%.2f", nxnxn[1].getPrice())
                + ", "
                + nxnxn[1].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn3x3());
    }

    public String nxnxnQuantity4x4() {
        return type
                + "(4x4), $"
                + String.format("%.2f", nxnxn[2].getPrice())
                + ", "
                + nxnxn[2].getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInNxnxn4x4());
    }

    public String otherPuzzelsQuantity() {
        return type
                + ", $"
                + String.format("%.2f", otherPuzzels.getPrice())
                + ", "
                + otherPuzzels.getQuantity() + " units, Total: $"
                + String.format("%.2f", totalValueInOtherPuzzels());
    }
}
