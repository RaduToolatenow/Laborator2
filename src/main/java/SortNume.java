import java.util.Comparator;

public class SortNume implements Comparator<Studenti> {
    @Override
    public int compare(Studenti a, Studenti b) {

        int resGrupa = a.getGrupa().compareTo(b.getGrupa());
        if (resGrupa != 0) return resGrupa;

        int resNume = a.getNume().compareTo(b.getNume());
        if (resNume != 0) return resNume;

        return a.getPrenume().compareTo(b.getPrenume());
    }
}