package statistics.variance;

import statistics.exception.NoDataException;
import statistics.exception.NoMeanCalculateException;
import statistics.mean.RawScoreMeanCalculate;
import statistics.model.RawScoreInterface;

import java.util.Iterator;

public class RawScoreVarianceCalculate extends AbstractVarianceCalculate {

    public RawScoreVarianceCalculate() {
        meanCalculate = new RawScoreMeanCalculate();
    }

    @Override
    public double calc(Iterable iterable) {
        if (meanCalculate == null) {
            throw new NoMeanCalculateException();
        }

        double mean = meanCalculate.calc(iterable);
        int count = 0;
        double sum = 0;
        Iterator<RawScoreInterface> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            double num = iterator.next().getNum();
            double diff = num - mean;
            sum += diff * diff;
            count++;
        }

        if (count <= 1) {
            throw new NoDataException();
        }
        return sum / (count - 1);
    }
}
