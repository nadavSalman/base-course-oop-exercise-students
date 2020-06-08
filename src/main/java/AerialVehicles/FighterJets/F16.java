package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class F16 extends AerialVehicle implements AerialAttackVehicle , AerialBdaVehicle {



    private int numberOfMissiles;
    private String missilesType;
    private String cameraType;

    public F16(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
    }


    @Override
    public void flyTo() {

    }

    @Override
    public void land() {

    }

    @Override
    public void check() {

    }

    @Override
    public void repair() {

    }

    @Override
    public String attack() {
        return null;
    }

    @Override
    public String preformBda() {
        return null;
    }
}
