public class not {

    public boolean areIncreasing(int a, int b, intc){
        // return a < b && b < c;
        return !(a >= b || b >= c);
    }

    public boolean hasSameSign(int a, int b){
        return (a < 0 && b < 0) || (a >= 0 && b >= 0);

        return a * b >= 0;
    }
} x