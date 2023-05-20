package calculadoraProyecto;
import EstructurasDeControl.condicionales.Switch;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        // Instanciar objetos
        Scanner leer = new Scanner(System.in);
        calculadoraImpl aCalculadora = new calculadoraImpl();
        String iniciar = "y";
        int numOpp;
        switchCalculadora calculadora = new switchCalculadora();

        //1. interfaz


        //Menu

        System.out.println("Bienvenido a la calculadora de Oliver!");
        System.out.println("Este es un proyecto chiquito pero se que pondre a prueba mis conocimientos");



        //2.Condicionales para entrar en el metodo
        do {

            System.out.println("Que operacion quieres hacer?");
            System.out.println("1 = suma. 2 = resta. 3 = division. Cualquier otro numero = Salir.");
            numOpp = leer.nextInt();
            calculadora.switchCalculadora(numOpp);





            System.out.println("Quieres seguir haciendo operaciones? (y),(n)");
            iniciar = leer.next();
        }while(iniciar.equalsIgnoreCase("y"));
    }
}
