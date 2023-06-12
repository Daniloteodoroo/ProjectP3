package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class viewToCheckOtherpuzzlesController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private Label txt;

    public void initialize() {
        txt.setText(txt.getText() + " " + App.product.getOther());
    }

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    void switchCubeTypesCheck(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesCheck");
    }
}
