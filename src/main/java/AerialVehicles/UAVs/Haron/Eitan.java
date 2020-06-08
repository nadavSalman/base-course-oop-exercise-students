package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.FighterJets.AttckFix;
import Missions.*;

public class Eitan extends AerialVehicle implements AerialIntelligenceVehicle , AerialAttackVehicle {

    private int numberOfMissiles;
    private String missilesType;
    private String sensorType;

    public Eitan(    int numberOfMissiles,String missilesType , String sensorType,  String pilotName,Mission mission,int flightHoursSinceLastPatch,boolean flightStatus) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
        this.numberOfMissiles = numberOfMissiles;
        this.missilesType = missilesType;
        this.sensorType = sensorType;
    }

    @Override
    public void check() {
        if(this.flightHoursSinceLastPatch > HaronFix.MAX_HOUR_OF_FLIGHT_BEFORE_REPAIR)
            repair();
    }

    @Override
    public String attack() {
        return this.pilotName+": Eitan Attacking "+((AttackMission)(this.mission)).getTarget()+" with: "+
                this.missilesType+"X"+this.numberOfMissiles;
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName+": Eitan Collecting Data in "+((IntelligenceMission)(this.mission)).getRegion()+
                " with sensor type: "+this.sensorType;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public String getMissilesType() {
        return missilesType;
    }

    public void setMissilesType(String missilesType) {
        this.missilesType = missilesType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
}
