package Missions;

import Entities.Coordinates;

public class IntelligenceMission extends Mission implements MissionService{
    private String region;

    public IntelligenceMission(String region,Coordinates coordinates) {
        super(coordinates);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public void begin() {
        System.out.println("Beginning Mission!");
    }

    @Override
    public void cancel() {
        System.out.println("Abort Mission!");
    }

    @Override
    public void finish() {
        System.out.println("Finish Mission!");
    }
}
