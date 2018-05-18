package statistics.mean;

import statistics.exception.NoDataException;
import com.rsp.core.util.statistics.model.RawScoreInterface;

import java.util.Iterator;

/**
 * 原始数据(未处理数据)的平均值
 */
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
