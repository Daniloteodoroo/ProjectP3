package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewToAddNxnxnController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private TextField informarQuantidade;

    @FXML
    private TextField informarTipo;

    @FXML
    private Button botaoAdicionar;

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    void switchCubeTypesAdd(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesAdd");
    }

    @FXML
    void adicionar(ActionEvent event) {
        String tipo = informarTipo.getText();
        String valor = informarQuantidade.getText();

        for (int i = 0; i < valor.length(); i++) {
            if (Character.isDigit(valor.charAt(i)) == false) {
                return;
            }
        }

        if (tipo.equals("2x2")) {
            App.product.addProductsInNxnxn2x2(Integer.parseInt(valor));
        } else if (tipo.equals("3x3")) {
            App.product.addProductsInNxnxn3x3(Integer.parseInt(valor));
        } else if (tipo.equals("4x4")) {
            App.product.addProductsInNxnxn4x4(Integer.parseInt(valor));
        }
    }
}