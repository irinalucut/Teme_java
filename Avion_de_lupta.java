public class Avion_de_lupta extends Avion {

    public Avion_de_lupta(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);

    }

    public void launchMissile(){
        System.out.println("”PlaneID Value Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }
}
