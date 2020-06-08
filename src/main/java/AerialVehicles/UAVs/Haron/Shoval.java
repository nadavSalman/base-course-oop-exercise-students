package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionService;
import Missions.MissionTypeException;



public class Shoval extends AerialVehicle implements AerialAttackVehicle , AerialIntelligenceVehicle , AerialBdaVehicle {


    private int numberOfMissiles;
    private String missilesType;
    private String sensorType;
    private String cameraType;

    public Shoval(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
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

