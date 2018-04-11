package statistics.mean;

import statistics.exception.NoDataException;
import statistics.model.RawScoreInterface;

import java.util.Iterator;

public class RawScoreMeanCalculate implements MeanCalculateInterface {

    public double calc(Iterable iterable) {
        if (iterable == null) {
            throw new NoDataException();
        }

        double sum = 0;
        int count = 0;
        Iterator<RawScoreInterface> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().getNum();
            count++;
        }

        if (count == 0) {
            throw new NoDataException();
        }
        return sum / count;
    }
}
