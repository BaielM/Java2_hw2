public class Main {
    public static void main(String[] args) {
        createObject("Football");
        createObject("Basketball");
        createObject("Volleyball");

    }

    public static Sports createObject(String className) {
        switch (className) {
            case "Football":
                Football football = new Football("Football", "Ten Hag", 2029, 2, "Baiel");
                football.print();
                break;
            case "Basketball":
                Basketball basketball = new Basketball("Basketball", "Ten Hag", 2018, 121, "Lakers");
                basketball.print();
                break;
            case "Volleyball":
                Volleyball volleyball = new Volleyball("Volleyball", "Volleyball couch", 2022, "California", 6);
                volleyball.print();
                break;

        }
        return null;
    }
}