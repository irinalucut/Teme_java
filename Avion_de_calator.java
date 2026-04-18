public class Avion_de_calator extends Avion {
    private int maxPassenger;

    public Avion_de_calator(String planeID, int totalEnginePower, int maxPassenger){
        super(planeID, totalEnginePower);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassengers(){
        return maxPassenger;
    }
    
}
