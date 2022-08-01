package Modiuel;

public class ParkingSlot {
    private int SlotNo;
    private String VehicleType;
    private String Status;

    public ParkingSlot() {
    }

    public ParkingSlot(int slotNo, String vehicleType, String status) {
        SlotNo = slotNo;
        VehicleType = vehicleType;
        Status = status;
    }

    public int getSlotNo() {
        return SlotNo;
    }

    public void setSlotNo(int slotNo) {
        SlotNo = slotNo;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "SlotNo=" + SlotNo +
                ", VehicleType='" + VehicleType + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
