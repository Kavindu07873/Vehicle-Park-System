package Modiuel;

public interface vehicle {
    default void park(String vehicleNumber, String vehicleType, String parkingSlotNo, String driver, String Time) {

    }

    void leavePark(String vehicleNumber,String vehicleType,String parkingSlotNo,String driver,String Time);

}

