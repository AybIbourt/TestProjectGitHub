package Test1;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Test1Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblOPL;
    public Button btnOptellen;

    public void Clicked_Optellen(MouseEvent mouseEvent) {
        int Getal1 = Integer.parseInt(txtGetal1.getText());
        int Getal2 = Integer.parseInt(txtGetal2.getText());

        int oplossing = Getal1 +Getal2;
        lblOPL.setText(String.valueOf(oplossing));
    }
}
