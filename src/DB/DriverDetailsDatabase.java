package DB;

import Modiuel.DriversDetails;

import java.util.ArrayList;

public class DriverDetailsDatabase {
    public static ArrayList<DriversDetails> DriverTable = new ArrayList<DriversDetails>();

    static {

        DriverTable.add(
          new DriversDetails("Sumith Kumara ","2002r","119","gale","1990")
        );
        DriverTable.add(
                new DriversDetails("Amila Pathirana","8826253734V","B3354674","gale","0717573583")
        );
        DriverTable.add(
                new DriversDetails("Jithmal Perera ","9283289272V"," B3674589 ","Horana"," 0772452457")
        );
        DriverTable.add(
                new DriversDetails("Sumith Dissanayaka ","9425245373V ","B8366399 ","Kaluthara"," 0782686390")
        );
        DriverTable.add(
                new DriversDetails("Sumanasiri Herath"," 8976544373V ","B3537538 ","Beruwala ","0772534436")
        );
        DriverTable.add(
                new DriversDetails("Awantha Fernando"," 9173537839V ","B3554789"," Colombo"," 5 0714534356")
        );
        DriverTable.add(
                new DriversDetails("Charith Sudara ","9573536833V"," B6835836"," Baththaramulla ","0771536662")
        ); DriverTable.add(
                new DriversDetails("Prashan Dineth"," 9362426738V"," B2683536"," Wadduwa"," 0715353434")
        );
        DriverTable.add(
                new DriversDetails("Chethiya Dilan"," 9162353436V"," B6836836 ","Panadura ","0772436737")
        );
        DriverTable.add(
                new DriversDetails("Sumith Udayanga ","8735354355V ","B3573783"," Galle ","0703635442")
        );
        DriverTable.add(
                new DriversDetails("Dinesh Udara ","9026344373V"," B5343783"," Hettimulla ","0713456878")
        );
        DriverTable.add(
                new DriversDetails("Udana Chathuranga"," 9692653338V ","B7888632"," Kottawa"," 0772442444")
        );
        DriverTable.add(
                new DriversDetails("Mohommad Riaz"," 9124537733V"," B3638537 ","Kaluthara"," 0777544222")
        );
        DriverTable.add(
                new DriversDetails("Sandun Kumara ","9563524267V"," B2263333 ","Panadura"," 0772325544")
        );
        DriverTable.add(
                new DriversDetails("Priyanga Perera"," 9135343537V ","B3853753"," Matara"," 072334456")
        );

    }

}
