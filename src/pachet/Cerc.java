package pachet;
public class Cerc implements Calcul {
    private double raza;
    public Cerc(double r){this.raza=r;}
    @Override
    public double calculPerimetru(){
        return (3.14*raza*2);
    }
}
