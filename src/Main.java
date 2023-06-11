public class Main {
    public static void main(String[] args) {
        /*createObject("Football");
        createObject("Basketball");
        createObject("Volleyball");*/
        Printable[] sports = new Printable[3];
        sports[0] = createObject("Football");
        sports[1] = createObject("Basketball");
        sports[2] = createObject("Volleyball");

        for (Printable object : sports) {
            object.print();
        }
    }


    public static Sports createObject(String className) {
        switch (className) {
            case "Football":
                Football football = new Football("Football", "Ten Hag", 2029, 2, "Baiel");
                football.print();
                return football;
            case "Basketball":
                Basketball basketball = new Basketball("Basketball", "Ten Hag", 2018, 121, "Lakers");
                basketball.print();
                return basketball;
            case "Volleyball":
                Volleyball volleyball = new Volleyball("Volleyball", "Volleyball couch", 2022, "California", 6);
                volleyball.print();
                return volleyball;

        }
        return null;
    }
}