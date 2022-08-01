package View.tm;

import javafx.scene.control.Button;

public class DriversTM {
    private String Name;
    private String Nic;
    private String LicenceNo;
    private String Address;
    private String ContNo;
    private Button btn;

    public DriversTM() {
    }

    public DriversTM(String name, String nic, String licenceNo, String address, String contNo, Button btn) {
        Name = name;
        Nic = nic;
        LicenceNo = licenceNo;
        Address = address;
        ContNo = contNo;
        this.btn = btn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getLicenceNo() {
        return LicenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        LicenceNo = licenceNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContNo() {
        return ContNo;
    }

    public void setContNo(String contNo) {
        ContNo = contNo;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "DriversTM{" +
                "Name='" + Name + '\'' +
                ", Nic='" + Nic + '\'' +
                ", LicenceNo='" + LicenceNo + '\'' +
                ", Address='" + Address + '\'' +
                ", ContNo='" + ContNo + '\'' +
                ", btn=" + btn +
                '}';
    }
}
