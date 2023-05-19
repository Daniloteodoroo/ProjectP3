package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewCubeTypesHireController {

    @FXML
    private Button botaoNxnxn;

    @FXML
    private Button botaoOtherpuzzels;

    @FXML
    private Button botaoVoltar;

    @FXML
    void switchToHireCubeNxnxn(ActionEvent event) throws IOException {
        App.setRoot("viewToHireNxnxn");
    }

    @FXML
    void switchToHireCubeOtherpuzzels(ActionEvent event) throws IOException {
        App.setRoot("viewToHireOtherpuzzles");
    }

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

}
