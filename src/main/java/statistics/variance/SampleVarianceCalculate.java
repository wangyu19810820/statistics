package statistics.variance;

import statistics.exception.NoDataException;
import statistics.exception.NoMeanCalculateException;

import java.util.Iterator;

/**
 * 样本方差
 */
public class SampleVarianceCalculate extends AbstractVarianceCalculate {

    @Override
    public double calc(Iterable iterable) {
        if (meanCalculate == null) {
            throw new NoMeanCalculateException();
        }

        double mean = meanCalculate.calc(iterable);
        int count = 0;
        double sum = 0;
        Iterator<Double> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            double num = iterator.next();
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
