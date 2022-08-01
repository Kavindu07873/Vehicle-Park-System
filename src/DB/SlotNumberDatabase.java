package DB;

import Modiuel.ParkingSlot;

import java.util.ArrayList;

public class SlotNumberDatabase {
    public  static ArrayList<ParkingSlot> SlotArray = new ArrayList<ParkingSlot>();

    static {
        SlotArray.add(new ParkingSlot(1,"VAn","Available"));
        SlotArray.add(new ParkingSlot(2,"VAn","Available"));
        SlotArray.add(new ParkingSlot(3,"VAn","Available"));
        SlotArray.add(new ParkingSlot(4,"VAn","Available"));
        SlotArray.add(new ParkingSlot(12,"VAn","Available"));
        SlotArray.add(new ParkingSlot(13,"VAn","Available"));
        SlotArray.add(new ParkingSlot(14,"Bus","Available"));
        SlotArray.add(new ParkingSlot(5,"CargoLorry","Available"));
        SlotArray.add(new ParkingSlot(6,"CargoLorry","Available"));
        SlotArray.add(new ParkingSlot(7,"CargoLorry","Available"));
        SlotArray.add(new ParkingSlot(8,"CargoLorry","Available"));
        SlotArray.add(new ParkingSlot(9,"CargoLorry","Available"));
        SlotArray.add(new ParkingSlot(10,"CargoLorry","Available"));
        SlotArray.add(new ParkingSlot(11,"CargoLorry","Available"));

    }


}

