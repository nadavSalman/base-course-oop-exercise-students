package Missions;


import Entities.Coordinates;

public abstract class Mission{
    protected Coordinates coordinates;

    public Mission(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
