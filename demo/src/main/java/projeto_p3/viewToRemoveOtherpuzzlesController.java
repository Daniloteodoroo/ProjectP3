package projeto_p3;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class viewToRemoveOtherpuzzlesController {

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoEnviar;

    @FXML
    private Button botaoVoltarMenu;

    @FXML
    private TextField informarQuantidade;

    @FXML
    void switchToOptions(ActionEvent event) throws IOException {
        App.setRoot("viewOptions");
    }

    @FXML
    void switchCubeTypesRemove(ActionEvent event) throws IOException {
        App.setRoot("viewCubeTypesRemove");
    }

    @FXML
    public void Remover(){
        String txt = informarQuantidade.getText();

        for(int i = 0; i < txt.length(); i++)
        {
            if(Character.isDigit(txt.charAt(i)) == false)
            {
                return;
            }
        }
        
        App.product.removeOtherPuzzels(Integer.parseInt(txt));
    }
}