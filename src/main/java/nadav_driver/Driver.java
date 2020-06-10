package nadav_driver;

import AerialVehicles.UAVs.Haron.Eitan;
import Entities.Coordinates;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.IntelligenceMission;

import java.util.Date;

/**
 * The existence of this class is temporary ,
 * its main purpose is to run parts
 * and interrogate their behavior before running UnitTesting.
 */
public class Driver {


    public static void main(String[]args){
        //test assentioonal:
        Coordinates coordinatesToAttack = new Coordinates(31.389906, 34.330190);
        AttackMission attackMission = new AttackMission("suspect house", coordinatesToAttack);
        BdaMission bdaMission = new BdaMission("suspect house", coordinatesToAttack);
        IntelligenceMission intelligenceMission = new IntelligenceMission("Deir al Balah", coordinatesToAttack);
        Eitan eitan = new Eitan(1, "nimrod", "elint", "Sheleg", attackMission, 52, true);

        eitan.setHoursOfFlightSinceLastRepair(125);

        System.out.println("eitan.getHoursOfFlightSinceLastRepair() -> "+eitan.getHoursOfFlightSinceLastRepair());


    }
}
