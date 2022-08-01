package Modiuel;

public class DriversDetails {
     private String Name;
     private String Nic;
     private String LicenceNo;
     private String Address;
     private String ContNo;

    public DriversDetails() {
    }

    public DriversDetails(String name, String nic, String licenceNo, String address, String contNo) {
        Name = name;
        Nic = nic;
        LicenceNo = licenceNo;
        Address = address;
        ContNo = contNo;
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

    @Override
    public String toString() {
        return "DriversDetails{" +
                "Name='" + Name + '\'' +
                ", Nic='" + Nic + '\'' +
                ", LicenceNo='" + LicenceNo + '\'' +
                ", Address='" + Address + '\'' +
                ", ContNo='" + ContNo + '\'' +
                '}';
    }
}
