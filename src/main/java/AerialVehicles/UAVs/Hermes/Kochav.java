package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;
import Missions.MissionService;

public class Kochav extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {

    private int numberOfMissiles;
    private String missilesType;
    private String sensorType;
    private String cameraType;

    public Kochav(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
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

    @Override
    public String collectIntelligence() {
        return null;
    }
}
