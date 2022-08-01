package View.tm;

public class DeliverTM   {
    private String VehicleName;
    private String VehicleType;
    private String Drivername;
    private String LeftTime;

    public DeliverTM() {
    }

    public DeliverTM(String vehicleName, String vehicleType, String drivername, String leftTime) {
        VehicleName = vehicleName;
        VehicleType = vehicleType;
        Drivername = drivername;
        LeftTime = leftTime;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getDrivername() {
        return Drivername;
    }

    public void setDrivername(String drivername) {
        Drivername = drivername;
    }

    public String getLeftTime() {
        return LeftTime;
    }

    public void setLeftTime(String leftTime) {
        LeftTime = leftTime;
    }

    @Override
    public String toString() {
        return "DeliverTM{" +
                "VehicleName='" + VehicleName + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", Drivername='" + Drivername + '\'' +
                ", LeftTime='" + LeftTime + '\'' +
                '}';
    }
}
