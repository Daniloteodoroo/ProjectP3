package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewAdicionarNovoCuboController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField nomeDoCubo;

    @FXML
    private TextField valorDoCubo;
    
    @FXML
    void switchOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }
}