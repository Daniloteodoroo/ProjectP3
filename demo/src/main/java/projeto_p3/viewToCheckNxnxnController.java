package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewToCheckNxnxnController {

    @FXML
    private Button botaoEnviar;

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private TextField informarTipo;

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    void switchPrev(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesCheck");
    }
}

