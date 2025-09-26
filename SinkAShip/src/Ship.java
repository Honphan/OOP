import java.util.ArrayList;

public class Ship {
    private String name;
    private ArrayList<String> locationCells;

    String checkLocationCells(String cell) {
        if(locationCells.contains(cell)){
            locationCells.remove(cell);
            if(locationCells.size() == 0) {
                return " tau " + name + "da bi pha huy ";
            }
            else return "da ban trung tau " + name;
        } else {
            return " khong ban trung tau ";
        }
    }



    public Ship(String name, ArrayList<String> locationCells) {
        this.name = name;
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
}
