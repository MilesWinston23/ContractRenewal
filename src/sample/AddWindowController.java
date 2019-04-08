package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class AddWindowController implements  Initializable {

    //Our textfield variables

    @FXML
    private ObservableList<Contract> controllerMainObservableList;



    @FXML
    private TextField contractTypeField;
    @FXML
    private TextField contractNameField;
    @FXML
    private TextField contractIdField;
    @FXML
    private TextField contractBusinessUnitField;
    @FXML
    private TextField contractOwnerField;
    @FXML
    private TextField contractDocTypeField;
    @FXML
    private TextField contractStatusField;
    @FXML
    private DatePicker contractStartDateField;
    @FXML
    private DatePicker contractEndDateField;
    @FXML
    private DatePicker contractReviewDateField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void submitButtonClicked(){
    Contract contract = new Contract(contractTypeField.getText(),contractNameField.getText(),contractBusinessUnitField.getText(),contractOwnerField.getText(),
            contractDocTypeField.getText(), contractStatusField.getText(), contractStartDateField.getValue(), contractEndDateField.getValue(), contractReviewDateField.getValue(), Integer.parseInt(contractIdField.getText()));
    }

}
