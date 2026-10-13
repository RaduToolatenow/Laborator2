import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lista {
    List<Integer> x = new ArrayList();
    List<Integer> y = new ArrayList();
    List<Integer> xPlusY = new ArrayList(); //a
    Set<Integer> zSet = new TreeSet(); //b
    List<Integer> xMinusY = new ArrayList();//c
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList(); //d

    Random rand = new Random();

    public void init() {
        IntStream.range(0, 5).forEach(i -> x.add(rand.nextInt(11)));
        IntStream.range(0, 7).forEach(i -> y.add(rand.nextInt(11)));
        Collections.sort(x);
        Collections.sort(y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


    public void Unire(){
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("xPlusY = " + xPlusY);

    }

    public void UnireComun(){
        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println("zSet = " + zSet);

    }

    public void UnireUnice(){
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("xMinusY = " + xMinusY);
    }

    public void LimitatP(){
        xPlusYLimitedByP = Stream.concat(x.stream(), y.stream())
                .filter(i -> i <= p)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("xPlusYLimitedByP = " + xPlusYLimitedByP);
    }

}
