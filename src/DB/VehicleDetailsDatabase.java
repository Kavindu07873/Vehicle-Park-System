package DB;

import Modiuel.VehiclesDetails;

import java.util.ArrayList;

public class VehicleDetailsDatabase {
        public static ArrayList<VehiclesDetails> VehiclesTable = new ArrayList<VehiclesDetails>();

static {
        VehiclesTable.add(
          new VehiclesDetails("NA-3434"," Bus"," 3500 ","60")
        ); VehiclesTable.add(
                new VehiclesDetails("KA-4563"," Van"," 1000"," 7")
        );VehiclesTable.add(
                new VehiclesDetails("58-3567 ","Van ","1500"," 4")
        );VehiclesTable.add(
                new VehiclesDetails("GF-4358 ","Van"," 800 ","4")
        );VehiclesTable.add(
                new VehiclesDetails("CCB-3568 ","Van"," 1800 ","8")
        );VehiclesTable.add(
                new VehiclesDetails("LM-6679"," Van ","1500"," 4")
        );VehiclesTable.add(
                new VehiclesDetails("QA-3369 ","Van ","1800"," 6")
        );VehiclesTable.add(
                new VehiclesDetails("KB-3668 ","CargLorry"," 2500 ","2")
        );VehiclesTable.add(
                new VehiclesDetails("JJ-9878"," Cargo Lorry ","3000"," 2")
        );VehiclesTable.add(
                new VehiclesDetails("GH-5772 ","Cargo Lorry ","4000"," 3")
        );VehiclesTable.add(
                new VehiclesDetails("XY-4456 ","Cargo Lorry"," 3500"," 2")
        );VehiclesTable.add(
                new VehiclesDetails("YQ-3536"," Cargo Lorry"," 2000"," 2")
        );VehiclesTable.add(
                new VehiclesDetails("CBB-3566 ","Cargo Lorry"," 2500 ","2")
        );

}
}
