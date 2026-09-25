public class Fewest{
    private String tempStr;

    public void fewestComparisons(double temp){
        if (temp < 40) {
            tempStr = "cold";
        } else if (temp < 60) {
            tempStr = "cool";
        } else if (temp < 80) {
            tempStr = "warm";
        } else {
            tempStr = "hot";
        }
        System.out.println(tempStr);
    }

}