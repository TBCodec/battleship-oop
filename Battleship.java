

public class Battleship {
    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    //public static int playerNumber;
    private Player[] players;
     public static void main(String[] args) {
        //Display.StartScreen();

        Display screen = new Display();
        screen.StartScreen();
        
        /*
        Az osztálynak Battleshipvannak olyan mezői Display, Inputamelyeket az egész program használ.
        Az osztálynak Battleshipvan egy hurka, amelyben a program fut.
        Az osztály Battleshipmegmutatja a főmenüt, és lehetővé teszi a felhasználó számára,
        hogy új játékot indítson, bemutassa a toplistákat és kilépjen.
        */
    }
}