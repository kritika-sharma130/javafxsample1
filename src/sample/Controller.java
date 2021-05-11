package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
public class Controller {
    public Button button;
    public void onButtonClick(ActionEvent actionEvent){
        button.setText("Hello,I am Kritika");
    }
}
