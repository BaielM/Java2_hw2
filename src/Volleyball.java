public class Volleyball extends Sports{
    private String location;
    private int numberOfPlayers;

    public Volleyball(String name, String couch, int year, String location, int numberOfPlayers) {
        super(name, couch, year);
        this.location = location;
        this.numberOfPlayers = numberOfPlayers;
    }
    public void print() {
        System.out.println("Sport name: " + getName() +
                "\nCouch: " + getCouch() +
                "\nYear: " + getYear() +
                "\nLocation: " + location +
                "\nNumber of players: " + numberOfPlayers +
                "\n-----------------------------------");
    }
}
