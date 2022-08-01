package Modiuel;

public class VehiclesDetails implements vehicle{
        private String VelNumber;
        private String Type;
        private String Weight;
        private String Passenger;

    public VehiclesDetails() {
    }

    public VehiclesDetails(String velNumber, String type, String weight, String passenger) {
        VelNumber = velNumber;
        Type = type;
        Weight = weight;
        Passenger = passenger;
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
        return Passenger;
    }

    public void setPassenger(String passenger) {
        Passenger = passenger;
    }

    @Override
    public String toString() {
        return "VehiclesDetails{" +
                "VelNumber='" + VelNumber + '\'' +
                ", Type='" + Type + '\'' +
                ", Weight='" + Weight + '\'' +
                ", Passenger='" + Passenger + '\'' +
                '}';
    }

    @Override
    public void park(String vehicleNumber, String vehicleType, String parkingSlotNo, String driver, String Time) {
        vehicle.super.park(vehicleNumber, vehicleType, parkingSlotNo, driver, Time);
    }

    @Override
    public void leavePark(String vehicleNumber, String vehicleType, String parkingSlotNo, String driver, String Time) {

    }
}
