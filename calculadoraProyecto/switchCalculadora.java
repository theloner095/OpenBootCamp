package calculadoraProyecto;

import java.util.Scanner;

public class switchCalculadora extends calculadoraImpl{


    public void switchCalculadora(int numOp){
        Scanner leer = new Scanner(System.in);


        switch (numOp) {
            case 1:
                System.out.println("Introduzca el primer valor a sumar");
                int a = leer.nextInt();
                System.out.println("Introduzca el segundo valor a sumar");
                int b = leer.nextInt();
                System.out.println(suma(a, b));
                break;


            case 2:
                System.out.println("Introduzca el primer valor a restar");
                a = leer.nextInt();
                System.out.println("Introduzca el segundo valor a restar");
                b = leer.nextInt();
                System.out.println(resta(a, b));
                break;

            case 3:
                System.out.println("Introduzca el primer valor a dividir");
                a = leer.nextInt();
                System.out.println("Introduzca el segundo valor a dividir");
                b = leer.nextInt();
                System.out.println(division(a, b));
                break;

            default:

                System.out.println("Saliendo...");
                return;
        }




    }
}
