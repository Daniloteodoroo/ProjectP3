package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewCubeTypesRemoveController {

    @FXML
    private Button botaoNxnxn;

    @FXML
    private Button botaoOtherpuzzles;

    @FXML
    private Button botaoVoltar;

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    void switchToRemoveCubeNxnxn(ActionEvent event) throws IOException {
        App.setRoot("viewToRemoveNxnxn");
    }

    @FXML
    void switchToRemoveCubeOtherpuzzels(ActionEvent event) throws IOException {
        App.setRoot("viewToRemoveOtherpuzzles");
    }

}


