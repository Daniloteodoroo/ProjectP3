package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewCubeTypesCheckController {

    @FXML
    private Button botaoNxnxn;

    @FXML
    private Button botaoOtherpuzzels;

    @FXML
    private Button botaoVoltar;

    @FXML
    void switchToCheckCubeNxnxn(ActionEvent event) throws IOException {
        App.setRoot("viewToCheckNxnxn");
    }

    @FXML
    void switchToCheckCubeOtherpuzzels(ActionEvent event) throws IOException {
        App.setRoot("viewToCheckOtherpuzzles");
    }

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }
}

