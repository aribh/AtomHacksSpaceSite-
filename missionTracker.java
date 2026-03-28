import java.util.ArrayList;

public class MissionTracker {
    private List<Mission> missions;

    public MissionTracker() {
        missions = new ArrayList<>();
    }

    public void addMission(String name, String status, int year) {
        Mission mission = new Mission(name, status, year);
        missions.add(mission);
    }

    public List<Mission> getAllMissions() {
        return new ArrayList<>(missions);
    }

    public Mission getMissionByName(String name) {
        for (Mission mission : missions) {
            if (mission.getName().equalsIgnoreCase(name)) {
                return mission;
            }
        }
        return null;
    }

    public void updateMissionStatus(String name, String newStatus) {
        Mission mission = getMissionByName(name);
        if (mission != null) {
            mission.setStatus(newStatus);
        }
    }

    public List<Mission> getMissionsByStatus(String status) {
        List<Mission> filtered = new ArrayList<>();
        for (Mission mission : missions) {
            if (mission.getStatus().equalsIgnoreCase(status)) {
                filtered.add(mission);
            }
        }
        return filtered;
    }

    public int getTotalMissions() {
        return missions.size();
    }
}