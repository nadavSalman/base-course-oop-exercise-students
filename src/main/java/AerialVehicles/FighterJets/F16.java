package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class F16 extends AerialVehicle implements AerialAttackVehicle , AerialBdaVehicle {



    private int numberOfMissiles;
    private String missilesType;
    private String cameraType;

    public F16( String cameraType , int numberOfMissiles, String missilesType,String pilotName, Mission mission , int flightHoursSinceLastPatch, boolean flightStatus) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
        this.numberOfMissiles = numberOfMissiles;
        this.missilesType = missilesType;
        this.cameraType = cameraType;
    }

    @Override
    public void check() {
        if(this.flightHoursSinceLastPatch > AttckFix.MAX_HOUR_OF_FLIGHT_BEFORE_REPAIR)
            repair();
    }



    @Override
    public String attack() {
        return this.pilotName+": F16 Attacking "+((AttackMission)(this.mission)).getTarget()+" with: "+
                this.missilesType+"X"+this.numberOfMissiles;
    }

    @Override
    public String preformBda() {
        return this.pilotName+": F16 taking pictures of "+((BdaMission)(this.mission)).getObjective()+" with: "+this.cameraType+" camera";
    }
}



