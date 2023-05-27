package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewToRemoveNxnxnController {

    @FXML
    private Button botaoEnviar;

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

}
