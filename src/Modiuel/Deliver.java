package Modiuel;

import View.tm.DeliverTM;

public class Deliver {
    private String VehicleName;
    private String vehicleType;
    private String Drivername;
    private String LeftTime;

    public Deliver() {
    }

    public Deliver(String vehicleName, String vehicleType, String drivername, String leftTime) {
        VehicleName = vehicleName;
        this.vehicleType = vehicleType;
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
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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
        return "Deliver{" +
                "VehicleName='" + VehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", Drivername='" + Drivername + '\'' +
                ", LeftTime='" + LeftTime + '\'' +
                '}';
    }

}
