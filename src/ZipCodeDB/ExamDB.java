package ZipCodeDB;
public class ExamDB {
    private double lat;

    public ExamDB(double lat) {
    }

    public void getNorthern(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "getNorthern{" +
                "lat=" + lat +
                '}';
    }
}
