public class Sports implements Printable{
    private String name;
    private String couch;
    private int year;

    public Sports(String name, String couch, int year) {
        this.name = name;
        this.couch = couch;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getCouch() {
        return couch;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {

    }
}
