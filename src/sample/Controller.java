package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Declare our tableview

    @FXML
    Button button;

    @FXML
    TableView<Contract> tableView;

    //Declare our columns

    @FXML
    private TableColumn<Contract, String> contractTypeColumn;
    @FXML
    private TableColumn<Contract, String> contractNameColumn;
    @FXML
    private TableColumn<Contract, Integer> contractIdColumn;
    @FXML
    private TableColumn<Contract, String> contractBusinessUnitColumn;
    @FXML
    private TableColumn<Contract, String> contractOwnerColumn;
    @FXML
    private TableColumn<Contract, String> contractDocTypeColumn;
    @FXML
    private TableColumn<Contract, String> contractStatusColumn;
    @FXML
    private TableColumn<Contract, LocalDate> contractStartDateColumn;
    @FXML
    private TableColumn<Contract, LocalDate> contractEndDateColumn;
    @FXML
    private TableColumn<Contract, LocalDate> contractReviewDateColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        contractTypeColumn.setCellValueFactory(new PropertyValueFactory<>("contractType"));
        contractNameColumn.setCellValueFactory(new PropertyValueFactory<>("contractName"));
        contractIdColumn.setCellValueFactory(new PropertyValueFactory<>("contractId"));
        contractBusinessUnitColumn.setCellValueFactory(new PropertyValueFactory<>("contractBusinessUnit"));
        contractOwnerColumn.setCellValueFactory(new PropertyValueFactory<>("contractOwner"));
        contractDocTypeColumn.setCellValueFactory(new PropertyValueFactory<>("contractDocType"));
        contractStatusColumn.setCellValueFactory(new PropertyValueFactory<>("contractStatus"));
        contractStartDateColumn.setCellValueFactory(new PropertyValueFactory<>("contractStartDate"));
        contractEndDateColumn.setCellValueFactory(new PropertyValueFactory<>("contractEndDate"));
        contractReviewDateColumn.setCellValueFactory(new PropertyValueFactory<>("contractReviewDate"));

        //Set tableview
        tableView.setItems(getContracts());


    }

    //Create Contract observable list

    private ObservableList<Contract> getContracts(){
        ObservableList<Contract> contracts = FXCollections.observableArrayList();
        contracts.add(new Contract("Adobe","Adobe Pro", "IT", "IT Manager", "PO", "Active",
                LocalDate.of( 2019, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2019, Month.JUNE, 1), 1));
        contracts.add(new Contract("Adobe","Adobe Pro", "IT", "IT Manager", "PO", "Active",
                LocalDate.of( 2019, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2019, Month.JUNE, 1), 2));
        return contracts;
        }

        //Handler for our new windows
    @FXML
    private void handleAddButton(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddContract.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add New Contract");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load window");
        }
    }

    @FXML
    private void handleAlertSelectButton(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AlertSelection.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add New Contract");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load window");
        }
    }

    @FXML
    private void deleteButtonClicked() {
        ObservableList<Contract> selectedRows, allPeople;
        allPeople = tableView.getItems();
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        selectedRows.forEach(allPeople::remove);
    }
}
