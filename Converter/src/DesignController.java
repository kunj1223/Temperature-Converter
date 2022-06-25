import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DesignController {

    @FXML
    private Button bttnCl;

    @FXML
    private Button bttnDis;

    @FXML
    private Button bttnEx;

    @FXML
    private TextArea txtarea;

    @FXML
    private TextField txtfldend;

    @FXML
    private TextField txtfldstart;

    @FXML
    void bttnClear(ActionEvent event) {
            txtarea.clear();
            txtfldend.clear();
            txtfldstart.clear();
    }

    @FXML
    void bttnDisplay(ActionEvent event) {
              
        if (txtfldstart.getText().isEmpty() || txtfldend.getText().isEmpty()) 
        {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error message");
            a.setContentText("The Value of end value and start value should not be empty.");
            a.show();  
        } 
          else {
            double val1 =Double.parseDouble(txtfldstart.getText());
            double val2 =Double.parseDouble(txtfldend.getText());
            txtarea.appendText("Celsius    Farenheit \n");
            for(; val1<=val2 ; val1++) {
                double val3=(val1*9/5+32);
                txtarea.appendText(val1+"              "+val3+"\n");
            }
         }

        
        
    }

    @FXML
    void bttnExit(ActionEvent event) {
        Alert a=new Alert(Alert.AlertType.CONFIRMATION); // new instance of alert to show when user click on exit button.
        a.setTitle("Confirmation Message ");  //to set title of exit page
        a.setContentText("Click Ok to exit! "); 
        a.showAndWait().ifPresent(response -> {
            if(response==ButtonType.OK)
            {
                System.exit(0);
            }
        });

    }

}
