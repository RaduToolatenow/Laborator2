import java.util.Comparator;

public class SortMedie implements Comparator<Studenti> {
    @Override
    public int compare(Studenti a, Studenti b) {
        return Double.compare(b.Medie(), a.Medie());
    }
}