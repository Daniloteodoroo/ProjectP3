package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class viewOptionsController {

    @FXML
    private Button adicionarQuantidade;

    @FXML
    private Button alugar;

    @FXML
    private Button cadastrarCriente;

    @FXML
    private Button cadastrarFuncionario;

    @FXML
    private Button novoCubo;

    @FXML
    private Button cadastrarPessoa;

    @FXML
    private Button removerQuantidade;

    @FXML
    private Button verificarQuantidade;

    @FXML
    void switchCadastrarCliente(ActionEvent event) throws IOException {
        App.setRoot("cadastrarCliente");
    }

    @FXML
    void switchCadastrarFuncionario(ActionEvent event) throws IOException {
        App.setRoot("cadastrarFuncionario");
    }
    
    @FXML
    void switchNovoCubo(ActionEvent event) throws IOException {
        App.setRoot("adicionarNovoCubo");
    }

    @FXML
    void switchToAddCubeTypes(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesAdd");
    }

    @FXML
    void switchToCheckCubeTypes(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesCheck");
    }

    @FXML
    void switchToRemoveCubeTypes(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesRemove");
    }

    @FXML
    void switchToHire(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesHire");
    }

}
