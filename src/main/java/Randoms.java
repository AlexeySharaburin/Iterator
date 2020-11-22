
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        Random random = new Random();
        int b = 0;
        while (b != 100_000) {
            list.add(random.nextInt((max - min) + 1) + min);
            b++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<>() {
            boolean isList = true;
            int numNext = 0;

            @Override
            public boolean hasNext() {
                if (numNext < list.size()) {
                    isList = true;
                } else {
                    isList = false;
                }
                return isList;
            }

            @Override
            public Integer next() {
                int next = 0;
                if (isList) {
                    next = list.get(numNext);
                    numNext++;
                }
                return next;
            }
        };

    }

}
