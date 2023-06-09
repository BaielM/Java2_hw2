public class Football extends Sports{
    private int goals;
    private String player;

    public Football(String name, String couch, int year, int goals, String player) {
        super(name, couch, year);
        this.goals = goals;
        this.player = player;
    }

    public void print() {
        System.out.println("Sport name: " + getName() +
                "\nCouch: " + getCouch() +
                "\nYear: " + getYear() +
                "\nNumber of goals: " + goals +
                "\nPlayer: " + player +
                "\n-----------------------------------");
    }
}
