package Modiuel;

public class Parking {

    private String VehicleNumber;
    private String VehicleType;
    private String ParkingSlot;
    private String Time;

    public Parking() {
    }

    public Parking(String vehicleNumber, String vehicleType, String parkingSlot, String time) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        ParkingSlot = parkingSlot;
        Time = time;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return ParkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        ParkingSlot = parkingSlot;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", ParkingSlot='" + ParkingSlot + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}
