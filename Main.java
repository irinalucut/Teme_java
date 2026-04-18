public class Main {
    public static void main (String[] args) throws Exception{
    Avion a1 = new Concorde("jsdwk", 500, 300);
    Avion a2 = new Mig ("shiena",5);
    Avion a3 = new TomCat ("shdkabd", 300);
    
    a1.takeOff();
    a2.land();
    a3.takeOff();
    ((TomCat)a3).refuel();
    ((Mig)a2).highSpeedGeometry();
    }
    

}
