public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long max = -1;
        long sum = 0;
        long min = 0;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
                sum += sale;
            }

            if (min == 0) {
                min = sale;
            } else if (sale < min) {
                min = sale;
            }
        }
        return (sum - min - max) / (sales.length - 2);
    }
}