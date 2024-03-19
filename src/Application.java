import pachet.*;

public class Application {
    public static void main(String[] args) {
        Cerc cerc=new Cerc(9.0);
        Patrat patrat=new Patrat(10);
        System.out.println("Perimetrul patratului este: "+patrat.calculPerimetru());
        System.out.println("Petimetrul cercului este: "+cerc.calculPerimetru());
    }
}