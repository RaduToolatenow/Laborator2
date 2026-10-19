import java.util.Comparator;

public class SortRestante implements Comparator<Studenti> {
    @Override
    public int compare(Studenti a, Studenti b) {
        return Long.compare(a.numarRestante(), b.numarRestante());
    }
}