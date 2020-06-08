package Missions;

import Entities.Coordinates;

public class BdaMission extends Mission implements  MissionService{
    private String objective;

    public BdaMission(String objective , Coordinates coordinates) {
        super(coordinates);
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
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
