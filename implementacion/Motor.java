package OOP.herencia.clases.implementacion;

public class Motor {

    //Atributos
    String modo;
    int cilindros;

    //Constructores

    public Motor(String modo, int cilindros){
        this.modo = modo;
        this.cilindros = cilindros;

    }


    //Metodos


    @Override
    public String toString() {
        return "Motor{" +
                "modo='" + modo + '\'' +
                ", cilindros=" + cilindros +
                '}';
    }
}
