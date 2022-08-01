package View.tm;

import javafx.scene.control.Button;

public class VehicleTM {
    private String VelNumber;
    private String Type;
    private String Weight;
    private String passenger;
    private Button btn;

    public VehicleTM() {
    }

    public VehicleTM(String velNumber, String type, String weight, String passenger, Button btn) {
        VelNumber = velNumber;
        Type = type;
        Weight = weight;
        this.passenger = passenger;
        this.btn = btn;
    }

    public String getVelNumber() {
        return VelNumber;
    }

    public void setVelNumber(String velNumber) {
        VelNumber = velNumber;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "VehicleTM{" +
                "VelNumber='" + VelNumber + '\'' +
                ", Type='" + Type + '\'' +
                ", Weight='" + Weight + '\'' +
                ", passenger='" + passenger + '\'' +
                ", btn=" + btn +
                '}';
    }
}
