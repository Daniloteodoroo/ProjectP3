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
    private Button atualizarPreco;

    @FXML
    private Button removerQuantidade;

    @FXML
    private Button verificarQuantidade;

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
    void switchToRide(ActionEvent event) {

    }

    @FXML
    void switchToUpDatePrice(ActionEvent event) {

    }

}
