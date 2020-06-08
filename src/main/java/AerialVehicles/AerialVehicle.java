package AerialVehicles;


import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionService;
import java.util.Date;

/**
 * AerialVehicle -  include 4 attributes that all types of Aerial Vehicle will have
 */
public abstract class AerialVehicle implements AerialVehicleService{

    protected String pilotName;
    protected Mission mission;
    protected int flightHoursSinceLastPatch;
    protected boolean flightStatus;

    public AerialVehicle(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean flightStatus) {
        this.pilotName = pilotName;
        this.mission = mission;
        flightHoursSinceLastPatch = flightHoursSinceLastPatch;
        this.flightStatus = flightStatus;
    }


    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return flightHoursSinceLastPatch;
    }

    public void setHoursOfFlightSinceLastRepair(int flightHoursSinceLastPatch) {
        flightHoursSinceLastPatch = flightHoursSinceLastPatch;
    }

    public boolean isFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(boolean flightStatus) {
        this.flightStatus = flightStatus;
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void flyTo() {
        Coordinates coordinates = this.getMission().getCoordinates();
        System.out.println("Flying to:"+coordinates.toString());
    }

    @Override
    public void repair() {
        this.flightStatus = true;
        this.flightHoursSinceLastPatch = 0;
    }








}
