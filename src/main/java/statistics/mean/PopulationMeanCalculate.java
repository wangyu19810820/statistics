package statistics.mean;

import statistics.exception.NoDataException;

import java.util.Iterator;

/**
 * 总体平均值
 */
public class PopulationMeanCalculate implements MeanCalculateInterface {

    @Override
    public double calc(Iterable iterable) {
        if (iterable == null) {
            throw new NoDataException();
        }

        double sum = 0;
        int count = 0;
        Iterator<Double> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
            count++;
        }

        if (count == 0) {
            throw new NoDataException();
        }
        return sum / count;
    }
}
