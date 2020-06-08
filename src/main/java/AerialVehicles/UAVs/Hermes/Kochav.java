package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.UAVs.Haron.HaronFix;
import Missions.*;

public class Kochav extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {

    private int numberOfMissiles;
    private String missilesType;
    private String sensorType;
    private String cameraType;

    public Kochav(int numberOfMissiles ,String pilotName ,String cameraType ,String sensorType,String missilesType ,   Mission mission, int flightHoursSinceLastPatch, boolean flightStatus ) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
        this.numberOfMissiles = numberOfMissiles;
        this.missilesType = missilesType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public void check() {
        if(this.flightHoursSinceLastPatch > HermesFix.MAX_HOUR_OF_FLIGHT_BEFORE_REPAIR)
            repair();
    }

    @Override
    public String attack() {
        return this.pilotName + ": Kochav Attacking " + ((AttackMission) (this.mission)).getTarget() + " with: " +
                this.missilesType + "X" + this.numberOfMissiles;
    }

    @Override
    public String preformBda() {
        return this.pilotName + ": Kochav taking pictures of " + ((BdaMission) (this.mission)).getObjective() + " with: " + this.cameraType+this.cameraType+" camera";
    }


    @Override
    public String collectIntelligence() {
        return this.pilotName + ": Kochav Collecting Data in " + ((IntelligenceMission) (this.mission)).getRegion() +
                " with sensor type: " + this.sensorType;
    }
}








