package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewToAddOtherpuzzlesController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private TextField informarQuantidade;

    @FXML
    private Button botaoEnviar;

    @FXML
    public void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    public void switchCubeTypesAdd(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesAdd");
    }

    @FXML
    public void adicionar() {
        String txt = informarQuantidade.getText(); //CAIXA DE TEXTO PARA SABER A QUANTIDADE

        for (int i = 0; i < txt.length(); i++) { //UM FOR PARA SABER SE Á UM CARACTERE QUE NÃO SEJA UM NÚMERO QUANDO INFORMAR A QUANTIDADE
            if (Character.isDigit(txt.charAt(i)) == false) {
                return;
            }
        }

        App.product.addProductsInOtherPuzzels(Integer.parseInt(txt)); //ADICIONANDO UMA NOVA QUANTIDADE DE CUBO AO ESTOQUE
    }
}