package OOP.herencia.clases.implementacion;

public class moto extends vehiculo{

    int multiplicadorMoto = 2;




    public moto(String models, String fabricante, Double cc, int year, int doors, String color, Boolean modeSport, Motor motor){
        super(models, fabricante, cc, year, doors, color, modeSport, motor);


    }

    @Override
    public void Acelerar(int cantidadAcelerar) {

        super.Acelerar(cantidadAcelerar * multiplicadorMoto);
    }

    public moto(){};
    @Override
    public String toString() {
        return "moto{" +
                "model='" + model + '\'' +
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
