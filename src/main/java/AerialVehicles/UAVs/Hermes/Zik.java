package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Zik extends AerialVehicle implements AerialIntelligenceVehicle , AerialAttackVehicle {


    private String sensorType;
    private String cameraType;

    public Zik(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
        super(pilotName, mission, flightHoursSinceLastPatch, flightStatus);
    }

    @Override
    public String attack() {
        return null;
    }

    @Override
    public String collectIntelligence() {
        return null;
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
}
