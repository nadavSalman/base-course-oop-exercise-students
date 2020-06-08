package Missions;

public interface MissionService {
    //When implemented should output "Beginning Mission!"
    public void begin();

    //When implemented should output "Abort Mission!"
    public void cancel();

    //When implemented should output "Finish Mission!"
    public void finish();
}
