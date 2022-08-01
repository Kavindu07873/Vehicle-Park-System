package DB;

import Modiuel.Parking;

import java.util.ArrayList;

public class ParkingDatabase {
    public static ArrayList<Parking> parkingstable = new ArrayList<Parking>();

    static {
        parkingstable.add(
                new Parking("1","1","1","1")
        );
    }
}
