package Modiuel;

public class van implements vehicle {
      private String VehicleNumber;
      private String VehicleType;
      private String Weight;
      private String Passengers;
      private String status;
      private String SlotNumber;
      private String driver;
      private String Time;

    public van() {
    }

    public van(String vehicleNumber, String vehicleType, String weight, String passengers, String status, String slotNumber, String driver, String time) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        Weight = weight;
        Passengers = passengers;
        this.status = status;
        SlotNumber = slotNumber;
        this.driver = driver;
        Time = time;
    }

    @Override
    public void park(String vehicleNumber, String vehicleType, String parkingSlotNo, String driver, String Time) {
        setStatus("InParking");
        this.setSlotNumber(parkingSlotNo);
        this.setDriver(driver);
        this.setTime(Time);
    }


    @Override
    public void leavePark(String vehicleNumber, String vehicleType, String parkingSlotNo, String driver, String Time) {
        setStatus("InParking");
        this.setDriver(driver);
       this.setTime(Time);
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

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getPassengers() {
        return Passengers;
    }

    public void setPassengers(String passengers) {
        Passengers = passengers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSlotNumber() {
        return SlotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        SlotNumber = slotNumber;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "van{" +
                "VehicleNumber='" + VehicleNumber + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", Weight='" + Weight + '\'' +
                ", Passengers='" + Passengers + '\'' +
                ", status='" + status + '\'' +
                ", SlotNumber='" + SlotNumber + '\'' +
                ", driver='" + driver + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}
