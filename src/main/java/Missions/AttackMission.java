package Missions;

import Entities.Coordinates;

public class AttackMission extends Mission implements MissionService{
    private String target;

    public AttackMission(String target,Coordinates coordinates) {
        super(coordinates);
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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
