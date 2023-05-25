package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewCubeTypesAddController {

    @FXML
    private Button botaoNxnxn;

    @FXML
    private Button botaoOtherpuzzels;

    @FXML
    private Button botaoVoltar;

    @FXML
    void switchToAddCubeNxnxn(ActionEvent event) throws IOException {
        App.setRoot("viewToAddNxnxn");
    }

    @FXML
    void switchToAddCubeOtherpuzzels(ActionEvent event) throws IOException {
        App.setRoot("viewToAddOtherpuzzles");
    }

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

}



