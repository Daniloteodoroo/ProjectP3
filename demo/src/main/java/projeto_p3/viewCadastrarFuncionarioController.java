package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewCadastrarFuncionarioController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField informarCPF;

    @FXML
    private TextField informarEnd;

    @FXML
    private TextField informarNome;

    @FXML
    private TextField informarTelefone;

    @FXML
    private TextField informeSalario;

    @FXML
    void switchOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }
}
