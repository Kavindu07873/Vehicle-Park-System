package Controller;

import DB.DriverDetailsDatabase;
import Modiuel.DriversDetails;
import View.tm.DriversTM;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class DriverDetailListController {
    public TableView<DriversTM> tblDriver;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colLicense;
    public TableColumn colAddress;
    public TableColumn ColContactNo;
    public TableColumn ColOption;
    public JFXTextField txtDriverName;
    public JFXTextField txtAddress;
    public JFXTextField txtNic;
    public JFXTextField txtContactNo;
    public JFXTextField txtLicenseNo;


    public  void initialize(){

        colName.setCellValueFactory(new PropertyValueFactory("Name"));
        colAddress.setCellValueFactory(new PropertyValueFactory("Address"));
        colLicense.setCellValueFactory(new PropertyValueFactory("LicenceNo"));
        colNic.setCellValueFactory(new PropertyValueFactory("Nic"));
        ColContactNo.setCellValueFactory(new PropertyValueFactory("ContNo"));
        ColOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllDrivers();
    }

    private void loadAllDrivers() {

        ObservableList<DriversTM> oblist = FXCollections.observableArrayList();

        for (DriversDetails D : DriverDetailsDatabase.DriverTable){
            Button btn = new Button("Delete");
            DriversTM tm = new DriversTM(D.getName(),D.getNic(),D.getLicenceNo(),D.getAddress(),D.getContNo(),btn);
              oblist.add(tm);

              btn.setOnAction((e)->{

                  Alert alert = new Alert(Alert.AlertType.CONFIRMATION,

                          "Are You Sure?"
                          ,ButtonType.YES,ButtonType.NO);
                    Optional<ButtonType> buttonType = alert.showAndWait();
                     if(buttonType.get().equals(ButtonType.YES)) {

                         DriverDetailsDatabase.DriverTable.remove(D);
                         oblist.remove(tm);
                     }
              });

        }
            tblDriver.setItems(oblist);
    }


    public void onClickActionSubmit(ActionEvent actionEvent) {

            DriversDetails D1 = new DriversDetails(
                    txtAddress.getText(),
                    txtDriverName.getText(),
                    txtContactNo.getText(),
                    txtLicenseNo.getText(),
                    txtNic.getText()
            );

            DriverDetailsDatabase.DriverTable.add(D1);
            loadAllDrivers();



    }



    public void onClickActionBack(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/ParkinSystem.fxml");


        Parent load= FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
