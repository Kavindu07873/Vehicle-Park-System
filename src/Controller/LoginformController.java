package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginformController {
    public TextField txtUserName;
    public PasswordField txtPassWord;
    public AnchorPane anchormanLogin;

    public void onClickSubmit(ActionEvent actionEvent) throws IOException {

            anchormanLogin.getChildren().clear();
            String tempUser = txtUserName.getText();
            String tempPassword = txtPassWord.getText();

            if(tempUser.equals("admin")&& tempPassword.equals("1234")) {

                URL resource = getClass().getResource("../View/ParkinSystem.fxml");
                Parent load = FXMLLoader.load(resource);
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }else {
                new Alert(Alert.AlertType.WARNING,"User Name or Password Incorrect Please Try again").show();
            }
    }
}
