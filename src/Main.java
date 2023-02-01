public class Main {
    public static void main(String[] args) {
        long[] sales = {150, 300, 1000};
        SalesManager sergey = new SalesManager(sales);
        System.out.println(sergey.max());
    }
}