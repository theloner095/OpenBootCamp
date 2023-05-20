package calculadoraProyecto;
import java.util.Scanner;
public class calculadoraImpl implements operaciones{

        Scanner leer = new Scanner(System.in);




    @Override
    public float suma(float a, float b) {

        return a + b;
    }

    @Override
    public float resta(float a, float b) {
        return a-b;
    }

    @Override
    public float division(float a, float b) {
        return a / b;
    }
}
