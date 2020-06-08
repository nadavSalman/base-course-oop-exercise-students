package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;


public class Shoval extends AerialVehicle implements AerialAttackVehicle , AerialIntelligenceVehicle , AerialBdaVehicle {


    private int numberOfMissiles;
    private String missilesType;
    private String sensorType;
    private String cameraType;


    public Shoval(String cameraType , int numberOfMissiles ,String missilesType , String sensorType, String pilotName ,  Mission mission ,int flightHoursSinceLastPatch,  boolean flightStatus ) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
        this.numberOfMissiles = numberOfMissiles;
        this.missilesType = missilesType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public void check() {
        if(this.flightHoursSinceLastPatch > HaronFix.MAX_HOUR_OF_FLIGHT_BEFORE_REPAIR)
            repair();
    }

    @Override
    public String attack() {
        return this.pilotName+": Shoval Attacking "+((AttackMission)(this.mission)).getTarget()+" with: "+
                this.missilesType+"X"+this.numberOfMissiles;
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName+": Shoval Collecting Data in "+((IntelligenceMission)(this.mission)).getRegion()+
                " with sensor type: "+this.sensorType;
    }

    @Override
    public String preformBda() {
        return this.pilotName+": Shoval taking pictures of "+((BdaMission)(this.mission)).getObjective()+" with: "+this.cameraType+this.cameraType+" camera";    }
}

