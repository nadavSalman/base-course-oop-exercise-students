package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Zik extends AerialVehicle implements AerialIntelligenceVehicle  , AerialBdaVehicle {


    private String sensorType;
    private String cameraType;

    public Zik(String cameraType,String sensorType ,   String pilotName,  Mission mission,  int flightHoursSinceLastPatch,boolean flightStatus ) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName + ": Zik Collecting Data in " + ((IntelligenceMission) (this.mission)).getRegion() +
                " with sensor type: " + this.sensorType;
    }

    @Override
    public void check() {
        if(this.flightHoursSinceLastPatch > HermesFix.MAX_HOUR_OF_FLIGHT_BEFORE_REPAIR)
            repair();
    }


    @Override
    public String preformBda() {
        return this.pilotName + ": Zik taking pictures of " + ((BdaMission) (this.mission)).getObjective() + " with: " +this.cameraType+" camera";
    }
}
