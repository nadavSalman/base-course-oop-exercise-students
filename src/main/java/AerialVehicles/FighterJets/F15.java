package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;
import Missions.*;

import java.util.Date;

public class F15 extends AerialVehicle implements AerialAttackVehicle , AerialIntelligenceVehicle {

    private int numberOfMissiles;
    private String sensorType;
    private String missilesType;

    public F15(String sensorType,int numberOfMissiles, String missilesType,String pilotName,Mission mission,int flightHoursSinceLastPatch,    boolean flightStatus) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
        this.numberOfMissiles = numberOfMissiles;
        this.sensorType = sensorType;
        this.missilesType = missilesType;
    }

    public F15(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getMissilesType() {
        return missilesType;
    }

    public void setMissilesType(String missilesType) {
        this.missilesType = missilesType;
    }


    @Override
    public String attack() {
        return this.pilotName+": F15 Attacking "+((AttackMission)(this.mission)).getTarget()+" with: "+
                this.missilesType+"X"+this.numberOfMissiles;
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName+": F15 Collecting Data in "+((IntelligenceMission)(this.mission)).getRegion()+
                " with sensor type: "+this.sensorType;
    }


    @Override
    public void check() {
        if(this.flightHoursSinceLastPatch > AttckFix.MAX_HOUR_OF_FLIGHT_BEFORE_REPAIR)
            repair();
    }


}
