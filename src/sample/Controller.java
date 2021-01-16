package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Button sendBtn;

    @FXML
    private void clickSendMsg(ActionEvent actionEvent) {
        if (!textField.getText().equals("")) {
            textArea.appendText(textField.getText() + System.lineSeparator());
            textField.clear();
            textField.requestFocus();
        }
    }
}
