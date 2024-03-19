package pachet;
public class Patrat implements Calcul{
    private double latura;
    public Patrat(double l){this.latura=l;}
    @Override
    public double calculPerimetru(){
        return latura*4;
    }
}
