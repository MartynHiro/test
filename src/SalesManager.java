public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int average() {
        int max = -1;
        int sum = 0;
        int min = 0;
        for (int sale : sales) {
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