package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewToCheckOtherpuzzlesController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    
    @FXML
    void switchPrev(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesCheck");
    }
}

