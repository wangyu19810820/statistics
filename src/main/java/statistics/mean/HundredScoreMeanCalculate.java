package statistics.mean;

import statistics.exception.NoDataException;
import com.rsp.core.util.statistics.model.RawScoreInterface;

import java.util.Iterator;

/**
 * 百分比数值数据(第二步计算结果数据)的平均值
 */
public class HundredScoreMeanCalculate implements MeanCalculateInterface {

    public double calc(Iterable iterable) {
        if (iterable == null) {
            throw new NoDataException();
        }

        double sum = 0;
        int count = 0;
        Iterator<RawScoreInterface> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().getHundredScore();
            count++;
        }

        if (count == 0) {
            throw new NoDataException();
        }
        return sum / count;
    }

}
