package Controller;

import DB.DeliveringDatabase;
import DB.ParkingDatabase;
import Modiuel.Deliver;
import Modiuel.Parking;
import View.tm.DeliverTM;
import View.tm.ParkingTM;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class ParkingSystemController {

public AnchorPane context;
    public JFXComboBox cmbSystem;
    public TableColumn colVehNumber;
    public TableColumn ColvehType;
    public TableColumn colParkSlot;
    public TableColumn colTime;
    public TableView<DeliverTM> tblInParking;
    public AnchorPane AnchorPaneContext;
    public AnchorPane AnyonePane2;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void initialize() throws IOException {
        ObservableList<String> System = FXCollections.observableArrayList();
        System.add("InParking");
        System.add("OnDelivery");

        cmbSystem.setItems(System);

        cmbSystem.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {


        if (cmbSystem.getSelectionModel().getSelectedItem().equals("InParking")){
         ColvehType.setCellValueFactory(new PropertyValueFactory("VehicleType"));
            colParkSlot.setCellValueFactory(new PropertyValueFactory("ParkingSlot"));
            colTime.setCellValueFactory(new PropertyValueFactory("Time"));
            colVehNumber.setCellValueFactory(new PropertyValueFactory("VehicleNumber"));


         loadAllParking();
        }

        if(cmbSystem.getSelectionModel().selectedItemProperty().equals("OnDelivery")){
            colParkSlot.setText("DriverName");
            colVehNumber.setCellValueFactory(new PropertyValueFactory("VehicleNumber"));
            colParkSlot.setCellValueFactory(new PropertyValueFactory("Drivername"));
            colTime.setCellValueFactory(new PropertyValueFactory("LeftTime"));
            ColvehType.setCellValueFactory(new PropertyValueFactory("VehicleType"));

           laodAllDelivery();
        }
});
    }
    //////////////////////////////////////////////////////////////////////////
    void laodAllDelivery() {
        ObservableList<DeliverTM> oblist = FXCollections.observableArrayList();
        for (Deliver D : DeliveringDatabase.DeliverTable) {
            DeliverTM tm = new DeliverTM(D.getVehicleName(),D.getVehicleType(),D.getDrivername()
                    ,D.getLeftTime());
            oblist.add(tm);
        }
    tblInParking.setItems(oblist);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void loadAllParking() {
        ObservableList<DeliverTM> obList = FXCollections.observableArrayList();
        for (Parking P : ParkingDatabase.parkingstable){
            ParkingTM tq = new ParkingTM(P.getVehicleNumber(), P.getVehicleType(), P.getParkingSlot(),P.getTime());
                    obList.add(tq);
    }
        tblInParking.setItems(obList);

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void OnActionDriverDetails(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/DriverDetailsList.fxml");
        Parent load=FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void onActionVehicleDetails(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../View/VehicleDetailList.fxml");
        Parent load=FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
