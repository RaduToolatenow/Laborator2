import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       //ex 2.7.1

        Lista lista = new Lista();

        lista.init();
        lista.Unire();
        lista.UnireComun();
        lista.UnireUnice();
        lista.LimitatP();



        //ex 2.7.2

        List<Studenti> studenti = new ArrayList<>();
        studenti.add(new Studenti("Popescu", "Marian", "225_3"));
        studenti.add(new Studenti("Popescu", "Maria", "225_3"));
        studenti.add(new Studenti("Popa", "Marian", "225_3"));
        studenti.add(new Studenti("Bica", "Irina", "225_3"));
        studenti.add(new Studenti("Badea", "Ion", "225_1"));
        studenti.add(new Studenti("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Studenti("Onofrei", "Mircea", "225_1"));

        //a
        for (Studenti s : studenti) {
            s.genereazaNoteAleatorii();
        }

        System.out.println("Lista studenti: ");
        studenti.forEach(System.out::println);

        //b1 Afisare grupe
        System.out.println("Ordonare dupa nume: ");
        Collections.sort(studenti, new SortNume());
        studenti.forEach(System.out::println);

        //b2 Dupa medie
        System.out.println("Ordonare dupa medie: ");
        List<Studenti> integralisti = studenti.stream()
                .filter(Studenti::esteIntegralist)
                .collect(Collectors.toList());

        Collections.sort(integralisti, new SortMedie());
        integralisti.forEach(System.out::println);

        //b2 Dupa nr restante
        System.out.println("Ordonare dupa restante: ");
        List<Studenti> restantieri = studenti.stream()
                .filter(s -> !s.esteIntegralist())
                .collect(Collectors.toList());

        Collections.sort(restantieri, new SortRestante());
        restantieri.forEach(System.out::println);


    }
}