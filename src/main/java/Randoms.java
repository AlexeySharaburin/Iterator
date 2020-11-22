
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {

        this.random = new Random();
        this.min = min;
        this.max = max;

    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<>() {
            boolean isList = true;
            int numNext = 0;

            @Override
            public boolean hasNext() {
                return isList;
            }

            @Override
            public Integer next() {
                int next = random.nextInt((max - min) + 1) + min;
                return next;
            }
        };

    }

}
