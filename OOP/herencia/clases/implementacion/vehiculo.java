package OOP.herencia.clases.implementacion;

public class vehiculo {

    // Atributos
    String model;
    String fabricante;
    Double cc;
    int year;
    int doors;
    String color;
    Boolean modeSport = false;
    int velocidad;
    Motor motor;

    //Constructores
        public vehiculo(){

        }
        public vehiculo(String models, String fabricante, Double cc, int year, int doors, String color, Boolean modeSport, Motor motor){
            this.model = models;
            this.fabricante = fabricante;
            this.cc = cc;
            this.year = year;
            this.doors = doors;
            this.color = color;
            this.modeSport = modeSport;
            this.motor = motor;
        }
    //Metodos (Comportamiento)
    public void Acelerar(int cantidadAcelerar){

               this.velocidad = this.velocidad += cantidadAcelerar;







    }

    @Override
    public String toString() {
        return "vehiculo{" +
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
