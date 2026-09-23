public class Weight {

    private int pounds;
    private int ounces;

    public Weight(int ounces) {
        this(ounces, 0);
    }

    public Weight(int ounces, int pounds) {
        if (ounces >= 0) {
            if (ounces < 16) {
                this.ounces = ounces;
            }
        }

        if (pounds > 0) {
            this.pounds = pounds;
        }
    }

    public int totalOunces(){
        return this.ounces + 16 * this.pounds;
    }

    public boolean isHeavier(Weight other){
        int totalW = this.totalOunces();
        int otherW = other.totalOunces();
        return totalW > otherW;
        // if(totalW > otherW)
        //     return true;
        // else
        //     return false; 
    }

    public Weight multiple(int scale){
        int total = totalOunces() * scale;
        int totalP = total / 16;
        int totalO = totalOunces() - (totalP * 16);
        return new Weight(totalP, totalO);
        
    }
}