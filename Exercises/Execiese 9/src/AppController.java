import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller on the main interface,Handling of events included,
 * Binding controls requires implementing interface Initializable, 
 * Use @Fxml to have the javafx system automatically bind the element
 * located in 1 in fxml,and use the id in fxml to correspond to the
 * attribute name in the controller
 */
public class AppController implements Initializable {

    // Clear button instance
    @FXML
    private Button btnClear;
    // Number 1 and number 2 input instance
    @FXML
    private TextField tfNum1, tfNum2;
    // Display label for details
    @FXML
    private Label lDetail;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    /**
     * To process button events, it is necessary to specify the value of onAction as
     * the function name for each button in fxml, and then the specified button can
     * be clicked to execute this function
     *
     * @param mouseEvent event instance
     */
    @FXML
    public void computed(ActionEvent mouseEvent) {
        // The currently clicked button
        Button target = (Button) mouseEvent.getTarget();

        // If the clicked button instance is a clear button, clear the value of the
        // numeric input box and reset the label of the calculation details
        if (target == btnClear) {
            tfNum1.setText("");
            tfNum2.setText("");
            lDetail.setText("Input number and click button");
            return;
        }
        // Otherwise, obtain the two input values and determine if they have already
        // been entered
        String num1 = tfNum1.getText();
        String num2 = tfNum2.getText();

        // The type of operation to be performed currently
        String text = target.getText();

        if ("".equals(num1)) {
            showAlert("Please input first number.");
            return;
        } else if ("".equals(num2)) {
            showAlert("Please input second number.");
            return;
        } else if (new BigDecimal(num2).compareTo(new BigDecimal("0")) == 0 && "/".equals(text)) {
            // If the current division operation is to be performed and the divisor is 0,
            // the prompt indicates that the divisor cannot be 0
            showAlert("0 cannot be used as a divisor.");
            return;
        }

        // Due to the possibility of inputting decimal numbers, Float and Double in Java
        // may lose longitude, so it needs to be converted to bIgDecimal for calculation
        BigDecimal bdNum1, bdNum2;
        try {
            bdNum1 = new BigDecimal(num1);
            bdNum2 = new BigDecimal(num2);
        } catch (NumberFormatException e) {
            // If a NumberFormatException exception is thrown, it indicates that the input
            // number is incorrect
            showAlert("Number format error.");
            return;
        }

        // Calculated value
        BigDecimal value = null;
        // Detailed explanation after this calculation
        String operateLabel = null;

        // Perform relevant calculations based on the current operating symbol type, and
        // provide detailed explanations that also need to be changed
        switch (text) {
            case "+": {
                // Addition operation
                value = bdNum1.add(bdNum2);
                operateLabel = " plus ";
                break;
            }
            case "-": {
                // Subtraction operation
                value = bdNum1.subtract(bdNum2);
                operateLabel = " subtract ";
                break;
            }
            case "*": {
                // Multiplication operation
                value = bdNum1.multiply(bdNum2);
                operateLabel = " multiply ";
                break;
            }
            case "/": {
                // Division
                value = bdNum1.divide(bdNum2);
                operateLabel = " divide ";
                break;
            }
        }
        // Update operation details to the control
        lDetail.setText(num1 + operateLabel + num2 + " equal " + value);
    }

    /**
     * Calling this function can pop up a prompt box
     *
     * @param message What needs to be displayed
     */
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        // set title
        alert.setTitle("Tips");
        // set header message
        alert.setHeaderText(null);
        // set content
        alert.setContentText(message);
        alert.show();
    }
}
