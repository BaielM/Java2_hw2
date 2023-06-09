public class Basketball extends Sports{
    private int points;
    private String team;

    public Basketball(String name, String couch, int year, int points, String team) {
        super(name, couch, year);
        this.points = points;
        this.team = team;
    }
    public void print() {
        System.out.println("Sport name: " + getName() +
                "\nCouch: " + getCouch() +
                "\nYear: " + getYear() +
                "\nNumber of points: " + points +
                "\nTeam: " + team +
                "\n-----------------------------------");
    }
}
