import java.util.ArrayList;
import java.util.List;


public class Studenti {
private String Nume;
private String Prenume;
private String Grupa;
private List<Integer> note;

public Studenti(String Nume, String Prenume, String Grupa) {
    this.Nume = Nume;
    this.Prenume = Prenume;
    this.Grupa = Grupa;
    note = new ArrayList<>();

}
public String getNume() {
    return Nume;
}
public void setNume(String Nume) {
    this.Nume = Nume;
}
public String getPrenume() {
    return Prenume;
}
public void setPrenume(String Prenume) {
    this.Prenume = Prenume;

}
public String getGrupa() {
    return Grupa;
}
public void setGrupa(String Grupa) {
    this.Grupa = Grupa;
}
public List<Integer> getNote() {
    return note;
}
public void adaugaNote(int nota) {
    note.add(nota);
}

public boolean esteIntegralist() {
    return note.size()==5&&note.stream().allMatch(i->i>=5);

}

    public long numarRestante() {
        return note.stream().filter(n -> n < 5).count();
    }

    public double Medie() {
        return note.isEmpty() ? 0 :
                note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return String.format("%-8s %-12s %-10s note=%-25s medie=%.2f restante=%d",
                Grupa, Nume, Prenume, note, Medie(), numarRestante());
    }

}
