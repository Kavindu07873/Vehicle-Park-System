package Controller;

import DB.VehicleDetailsDatabase;
import Modiuel.VehiclesDetails;
import View.tm.VehicleTM;
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

public class VehicleDetailListController {
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colWeight;
    public TableColumn colPassengers;
    public JFXTextField txtVehicleNumber;
    public JFXTextField txtVehicleType;
    public JFXTextField txtWeight;
    public JFXTextField txtPassengers;
    public TableColumn colOption;
    public TableView<VehicleTM> tblVehicle;


    public void initialize(){

        colVehicleNumber.setCellValueFactory(new PropertyValueFactory("VelNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory("Type"));
        colWeight.setCellValueFactory(new PropertyValueFactory("Weight"));
        colPassengers.setCellValueFactory(new PropertyValueFactory("passenger"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));

        loadAllVehicle();
    }

    private void loadAllVehicle() {

        ObservableList<VehicleTM> oblist = FXCollections.observableArrayList();

        for (VehiclesDetails V : VehicleDetailsDatabase.VehiclesTable){
            Button btn = new Button("Delete");
            VehicleTM tm = new VehicleTM(V.getVelNumber(),V.getType(),V.getWeight(),V.getPassenger(),btn);
            oblist.add(tm);

        btn.setOnAction((e)-> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "Are You Sure?",
                    ButtonType.YES, ButtonType.NO);
            Optional<ButtonType> buttonType = alert.showAndWait();

            if (buttonType.get().equals(ButtonType.YES)) {
            VehicleDetailsDatabase.VehiclesTable.remove(V);
            oblist.remove(tm);
        }
        });
        }


    tblVehicle.setItems(oblist);
    }

    public void OnClickActionBack(ActionEvent actionEvent) throws IOException {



        URL resource = getClass().getResource("../View/ParkinSystem.fxml");


        Parent load= FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void onClickActionSubmit(ActionEvent actionEvent) {
        VehiclesDetails V1 = new VehiclesDetails(
          txtVehicleNumber.getText(),
          txtVehicleType.getText(),
          txtWeight.getText(),
          txtPassengers.getText()
        );
        VehicleDetailsDatabase.VehiclesTable.add(V1);
        loadAllVehicle();
    }
}
