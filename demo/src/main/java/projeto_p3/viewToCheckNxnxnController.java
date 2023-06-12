package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class viewToCheckNxnxnController {
    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private Text four;

    @FXML
    private Text three;

    @FXML
    private Text two;

    public void initialize() {
        two.setText(two.getText() + App.product.get2x2()); //MOSTRA NA TELA O TIPO DE CUBO MAIS A QUANTIDADE
        three.setText(three.getText() + App.product.get3x3());
        four.setText(four.getText() + App.product.get4x4());
    }

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }
}