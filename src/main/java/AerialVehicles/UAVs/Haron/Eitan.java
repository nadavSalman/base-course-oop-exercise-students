package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Eitan extends AerialVehicle implements AerialIntelligenceVehicle , AerialAttackVehicle {

    private int numberOfMissiles;
    private String missilesType;
    private String sensorType;

    public Eitan(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
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
    public String collectIntelligence() {
        return null;
    }
}
