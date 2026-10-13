import java.util.Comparator;

public  class SortNume implements Comparator<Studenti> {
    @Override
    public int compare(Studenti o1, Studenti o2) {
        if(o1.Medie() == o2.Medie()) {
            return 0;
        }
        return o1.Medie() < o2.Medie() ? 1 : -1; //descrescator
    }
}