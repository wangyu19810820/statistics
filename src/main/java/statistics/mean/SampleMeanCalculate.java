package statistics.mean;

import statistics.exception.NoDataException;

import java.util.Iterator;

/**
 * 特殊平均值，用于特殊计算
 */
public class SampleMeanCalculate implements MeanCalculateInterface {

    @Override
    public double calc(Iterable iterable) {
        throw new RuntimeException("这个函数不会被使用到");
//        if (iterable == null) {
//            throw new NoDataException();
//        }
//
//        double sum = 0;
//        int count = 0;
//        Iterator<Double> iterator = iterable.iterator();
//        while (iterator.hasNext()) {
//            sum += iterator.next();
//            count++;
//        }
//
//        if (count == 0 || count == 1) {
//            throw new NoDataException();
//        }
//        return sum / (count - 1);
    }
}
