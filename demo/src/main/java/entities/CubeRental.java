package entities;

import java.util.Date;

import CubeTypes.nxnxn;
import CubeTypes.otherPuzzels;

public class CubeRental extends CubeStock {
    private boolean disponível; // UMA VARIÁVEL PARA SABER SE TEM CUBOS DISPONÍVEIS NO ESTOQUE 
    private nxnxn[] nxnxn; // [0] = 2x2, [1] = 3x3, [2] = 4x4
    private otherPuzzels otherPuzzels;

    public CubeRental (){ //CONTRUTOR PARA CHAMAR A CLASSE (NXNXN) E (OTHERPUZZLES)
        otherPuzzels = new otherPuzzels();
        nxnxn = new nxnxn[3];
        for (int i = 0; i < nxnxn.length; i++) {
            nxnxn[i] = new nxnxn();
        }
        this.disponível = true; //INICIANDO A VARIÁVEL COM TRUE 
    }

    // ALUGAR O CUBO DO TIPO (NXNXN)

    public void alugarNxnxn2x2 (){ //MÉTODO PARA ALUGAR UM CUBO NXNXN DO TIPO 2X2
        if (disponível){ //CONDIÇÃO PARA SABER SE TEM  CUBO DO TIPO 2X2 DISPONÍVEL NO ESTOQUE 
            disponível = false; //CASO A CONDIÇÃO FOR VERDADEIRA ELA RECEBE (FALSE) PARA DIZER QUE O CUBO ACABOU DE SER ALUGADO
            Date dataAtual = new Date();
            System.out.println("The product " + nxnxn[0] + " was rented in " + dataAtual + ".");
        } else { //CONDIÇÃO CASO NÃO TENHA CUBO DISPONÍVEL NO ESTOQUE
            System.out.println("Sorry, the produc " + nxnxn[0] + " is not available for rent at the moment.");
        }
    }

    public void alugarNxnxn3x3 (){ //MÉTODO PARA ALUGAR UM CUBO NXNXN DO TIPO 3X3
        if (disponível){ //CONDIÇÃO PARA SABER SE TEM  CUBO DO TIPO 2X2 DISPONÍVEL NO ESTOQUE 
            disponível = false; //CASO A CONDIÇÃO FOR VERDADEIRA ELA RECEBE (FALSE) PARA DIZER QUE O CUBO ACABOU DE SER ALUGADO
            Date dataAtual = new Date();
            System.out.println("The product " + nxnxn[1] + " was rented in " + dataAtual + ".");
        } else {
            System.out.println("Sorry, the produc " + nxnxn[1] + " is not available for rent at the moment.");
        }
    }

    public void alugarNxnxn4x4 (){ //MÉTODO PARA ALUGAR UM CUBO NXNXN DO TIPO 4X4
        if (disponível){  //CONDIÇÃO CASO NÃO TENHA CUBO DISPONÍVEL NO ESTOQUE
            disponível = false; //CASO A CONDIÇÃO FOR VERDADEIRA ELA RECEBE (FALSE) PARA DIZER QUE O CUBO ACABOU DE SER ALUGADO
            Date dataAtual = new Date();
            System.out.println("The product " + nxnxn[2] + " was rented in " + dataAtual + ".");
        } else { //CONDIÇÃO CASO NÃO TENHA CUBO DISPONÍVEL NO ESTOQUE
            System.out.println("Sorry, the produc " + nxnxn[2] + " is not available for rent at the moment.");
        }
    }

    // ALUGAR O CUBO DO TIPO (OTHERPUZZELS)

    public void alugarOtherpuzzels (){
        if (disponível){
            disponível = false;
            Date dataAtual = new Date();
            System.out.println("The product " + otherPuzzels + " was rented in " + dataAtual + ".");
        } else {
            System.out.println("Sorry, the produc " + otherPuzzels + " is not available for rent at the moment.");
        }
    }

    // DEVOLVER O CUBO DO TIPO (NXNXN)

    public void devolverNxnxn2x2 (){
        disponível = true; //DISPONÍVEL RECEBE TRUE PARA DIZER QUE O CUBO FOI DEVOLVIDO E QUE A CUBOS DISPONÍVEIS NO ESTOQUE
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[0] + "was returned in " + dataAtual);
    }

    public void devolverNxnxn3X3 (){
        disponível = true; //DISPONÍVEL RECEBE TRUE PARA DIZER QUE O CUBO FOI DEVOLVIDO E QUE A CUBOS DISPONÍVEIS NO ESTOQUE
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[1] + "was returned in " + dataAtual);
    }

    public void devolverNxnxn4X4 (){
        disponível = true; //DISPONÍVEL RECEBE TRUE PARA DIZER QUE O CUBO FOI DEVOLVIDO E QUE A CUBOS DISPONÍVEIS NO ESTOQUE
        Date dataAtual = new Date();

        System.out.println("the product " + nxnxn[2] + "was returned in " + dataAtual);
    }

    // DEVOLVER O CUBO DO TIPO (OTHERPUZZELS)

    public void devolverOtherpuzzels (){
        disponível = true; //DISPONÍVEL RECEBE TRUE PARA DIZER QUE O CUBO FOI DEVOLVIDO E QUE A CUBOS DISPONÍVEIS NO ESTOQUE
        Date dataAtual = new Date();

        System.out.println("the product " + otherPuzzels + "was returned in " + dataAtual);
    }

    public boolean disponibilidade (){ //MÉTODO PARA RETORNAR TRUE OU FALSE
        return disponível;
    }
}
