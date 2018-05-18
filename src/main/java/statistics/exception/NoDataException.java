package statistics.exception;

/**
 * 计算过程中，没有数据。
 * 有时没有数据会导致除0错误，用特殊的类标识是统计计算过程中没有数据
 */
public class NoDataException extends RuntimeException {
}
