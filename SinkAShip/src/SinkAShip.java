import java.util.ArrayList;

public class SinkAShip {
      GameHelper gameHelper;
      ArrayList<Ship> ships;
      int numberOfShips;

      void setupGame(){

      }

    public GameHelper getGameHelper() {
        return gameHelper;
    }

    public void setGameHelper(GameHelper gameHelper) {
        this.gameHelper = gameHelper;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public int getNumberOfShips() {
        return numberOfShips;
    }

    public void setNumberOfShips(int numberOfShips) {
        this.numberOfShips = numberOfShips;
    }
}
