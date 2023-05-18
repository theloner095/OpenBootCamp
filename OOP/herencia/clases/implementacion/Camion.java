package OOP.herencia.clases.implementacion;

public class Camion extends vehiculo {

        Boolean sRemolque;


    public Camion(String models, String fabricante, Double cc, int year, int doors, String color, Boolean modeSport, Motor motor, boolean semiRemolque){
        super(models, fabricante, cc, year, doors, color, modeSport, motor);
        sRemolque = semiRemolque;
    }



    @Override
    public void Acelerar(int cantidadAcelerar) {
        super.Acelerar(cantidadAcelerar - 10);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "sRemolque=" + sRemolque +
                ", model='" + model + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                ", modeSport=" + modeSport +
                ", velocidad=" + velocidad +
                ", motor=" + motor +
                '}';
    }
}
