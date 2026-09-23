public class WeightMain {
    public static void main(String[] args) {
        Weight w = new Weight(15); 
        Weight w1 = new Weight(10, 5);
        boolean b = w.isHeavier(w1);
        System.out.println(b);

        Weight w2 = w.multiple(2);
        w2.print();
    }
}