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
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    void switchCubeTypesAdd(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesAdd");
    }

}

