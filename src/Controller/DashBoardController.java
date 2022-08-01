package Controller;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import DB.*;
import Modiuel.*;
import View.tm.ParkingTM;
import com.sun.deploy.net.MessageHeader;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Objects;


public class DashBoardController   extends ParkingSystemController {
    public   ComboBox<String> cmbVehicle;
   public ComboBox<String> cmbDriver;
    public TextField txtVehicleType;
    public TextField txtV;
    public TextField txtD;
    public TextField txtTime;
    public TextField txtParkingSlot;
    public Label lblTime;
    public Label Time;
    public Label Date;
    public Button btnDeliveryShift;
    public Button btnPark;
    private ChoiceBox<ParkingTM> tblInParking;


    public void initialize() throws IOException {

        Time();
/////////////////////////////////// ComboBox Verhicle type ////////////////////////
        ObservableList<String> observableList = FXCollections.observableArrayList();


           observableList.add("NA-3434");
       observableList.add("KA-4563");
        observableList.add("58-3567");
        observableList.add("GF-4358");
       observableList.add("CCB-3568");
        observableList.add("LM-6679");
        observableList.add("QA-3369");
        observableList.add("KB-3668");
        observableList.add("JJ-9878");
        observableList.add("GH-5772");
        observableList.add("XY-4456");
        observableList.add("YQ-3536");
        observableList.add("CBB-3566");
        observableList.add("QH-3444 ");

        cmbVehicle.setItems(observableList);

        cmbVehicle.getSelectionModel().selectedItemProperty().
                addListener(this::changed);

//////////////////////////////////////////////// Combobox Driver Type//////////////////////////////////
        ObservableList<String> Driver = FXCollections.observableArrayList();
        Driver.add("Sumith Kumara");
        Driver.add("Amila Pathirana");
        Driver.add("Jithmal Perera ");
        Driver.add("Sumith Dissanayaka");
        Driver.add("Sumanasiri Herath ");
        Driver.add("Awantha Fernando ");
        Driver.add("Charith Sudara ");
        Driver.add("Prashan Dineth ");
        Driver.add("Chethiya Dilan");
        Driver.add("Dushantha Perera");
        Driver.add("Sumith Udayanga ");
        Driver.add("Dinesh Udara ");
        Driver.add("Udana Chathuranga");
        Driver.add("Mohommad Riaz");
        Driver.add("Sandun Kumara ");
        Driver.add("Priyanga Perera");

        cmbDriver.setItems(Driver);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ManagementLogin(ActionEvent actionEvent) throws IOException {

            URL resource = getClass().getResource("../View/LoginForm.fxml");

        Parent load=FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void OnDeliveryOnAction(ActionEvent actionEvent) {

        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if (Integer.parseInt(txtParkingSlot.getText()) == slot.getSlotNo()) {
                slot.setStatus("Available");
            }
        }
        btnPark.setDisable(false);
        btnDeliveryShift.setDisable(true);
            Deliver D = new Deliver(
        txtVehicleType.getText(),
                    txtV.getText(),
                    txtD.getText(),
                    txtTime.getText()
);
        DeliveringDatabase.DeliverTable.add(D);
        laodAllDelivery();

    }

    public void btnOnActionPark(ActionEvent actionEvent){


        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if (Integer.parseInt(txtParkingSlot.getText()) == slot.getSlotNo()) {
                slot.setStatus("Unavailable");
            }
        }
       btnPark.setDisable(true);
     btnDeliveryShift.setDisable(false);

        Parking P = new Parking(
                txtV.getText(),
                txtVehicleType.getText(),
                txtParkingSlot.getText(),
                txtTime.getText()
        );
ParkingDatabase.parkingstable.add(P);
        loadAllParking();
    }
//////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private void Time() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" yyyy-MM-dd \n   HH:mm:ss");

            Time.setText(LocalDateTime.now().format(formatter));

        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();

    }

    private void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("NA-3434".equals(newValue) && slot.getVehicleType().equals("Bus")
                    && slot.getStatus().equals("Available")) {
                newValue = "Bus";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("KA-4563".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
               txtV.setText(newValue);
                newValue = "Van";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("58-3567".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
                newValue = "Van";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("GF-4358".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
                newValue = "Van";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("CCB-3568".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
                newValue = "Van";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("GF-4358".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
                newValue = "Van";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("LM-6679".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
                newValue = "Van";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("QA-3369".equals(newValue) && slot.getVehicleType().equals("VAn")
                    && slot.getStatus().equals("Available")) {
                newValue = "Van";

                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("KB-3668".equals(newValue) && slot.getVehicleType().equals("CargoLorry")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("JJ-9878".equals(newValue) && slot.getVehicleType().equals("CargoLorry")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
        }
        for (ParkingSlot slot : SlotNumberDatabase.SlotArray) {
            if ("GH-5772".equals(newValue) && slot.getVehicleType().equals("CargoLorry")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
  } for (ParkingSlot slot : SlotNumberDatabase.SlotArray){
            if ("GH-5772".equals(newValue) && slot.getVehicleType().equals("CargoLorry ")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
  } for (ParkingSlot slot : SlotNumberDatabase.SlotArray){
            if ("YQ-3536".equals(newValue) && slot.getVehicleType().equals("CargoLorry ")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
  } for (ParkingSlot slot : SlotNumberDatabase.SlotArray){
            if ("CBB-3566".equals(newValue) && slot.getVehicleType().equals("CargoLorry ")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }
 } for (ParkingSlot slot : SlotNumberDatabase.SlotArray){
            if ("QH-3444".equals(newValue) && slot.getVehicleType().equals("CargoLorry ")
                    && slot.getStatus().equals("Available")) {
                newValue = "CargoLorry ";
                txtVehicleType.setText(newValue);
                txtParkingSlot.setText(String.valueOf(slot.getSlotNo()));
                btnPark.setDisable(false);
                btnDeliveryShift.setDisable(true);
            }

        }
    }
}


