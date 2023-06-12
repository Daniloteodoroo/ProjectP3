package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewToRemoveNxnxnController {

    @FXML
    private Button botaoRemover;

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private TextField informarQuantidade;

    @FXML
    private TextField informarTipo;

    @FXML
    void switchCubeTypesRemove(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesRemove");
    }

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    public void remover() {
        String tipo = informarTipo.getText(); //CAIXA DE TEXTO PARA SABER O TIPO
        String valor = informarQuantidade.getText(); //CAIXA DE TEXTO PARA SABER A QUANTIDADE

        for (int i = 0; i < valor.length(); i++) { //UM FOR PARA SABER SE Á UM CARACTERE QUE NÃO SEJA UM NÚMERO QUANDO INFORMAR A QUANTIDADE
            if (Character.isDigit(valor.charAt(i)) == false) {
                return;
            }
        }

        if (tipo.equals("2x2")) { //CONDIÇÃO PARA SABER O TIPO DO CUBO
            App.product.removeProductsNxnxn2x2(Integer.parseInt(valor));  //ADICIONANDO UMA NOVA QUANTIDADE DE CUBO AO ESTOQUE
        } else if (tipo.equals("3x3")) {
            App.product.removeProductsNxnxn3x3(Integer.parseInt(valor));
        } else if (tipo.equals("4x4")) {
            App.product.removeProductsNxnxn4x4(Integer.parseInt(valor));
        }
    }
}