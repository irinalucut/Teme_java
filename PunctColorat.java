public class PunctColorat extends Punct{
    private int c;

    public PunctColorat(String x, String y,int c){
        super( x, y);
        this.c = c;
    }
}
/*
Este necesar un constructor in clasa PunctColorat ca sa creeam 
un obiect deoare ce este necesar sa specificam parametrii de 
la clasa Punct prin "super(x, y)"" pentru ca clasa Punct sa 
obtina informatie si din subclasa PunctColorat.
 */