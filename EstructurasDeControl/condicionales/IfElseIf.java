package EstructurasDeControl.condicionales;
import java.util.Scanner;
public class IfElseIf {
 public static void main(String[] args){

     Scanner leer = new Scanner(System.in);


     System.out.println("Introduce debajo el dia que es: ");
     String dia  = leer.nextLine();



     int    edad = 20;






     //Ejemplos a comparar
     boolean resultadoNum = edad >= 20;
     boolean resultado = dia.equals("Martes");

        // If else if
        if(dia.equals("Lunes")){
            System.out.println("Vamos iniciando la semana!");
        } else if (dia.equals("Martes")) {
            System.out.println("Iniciamos la semana desde el Martes!");
        }else if (dia.equals("Miercoles")) {
            System.out.println("Iniciamos la semana desde el Miercoles!");
        }else if (dia.equals("Jueves")) {
            System.out.println("Iniciamos la semana desde el Jueves!");
        }else if (dia.equals("Viernes")) {
            System.out.println("Iniciamos la semana desde el Viernes!");
        }else if (dia.equals("Sabado")) {
            System.out.println("Iniciamos la semana desde el Sabado!");
        }else if (dia.equals("Domingo")) {
            System.out.println("Iniciamos la semana desde el Domingo!");
        }else{
            System.out.println("Ese dia no existe");
        }




 }


}
