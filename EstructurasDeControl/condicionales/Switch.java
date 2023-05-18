package EstructurasDeControl.condicionales;

public class Switch {
 public static void main(String[] args){
     String dia = "Lunes";



     // Switch
     switch(dia){
         case "Lunes":
             System.out.println("Seria lunes");
             break;
         case "Martes":
             System.out.println("Seria Martes");
             break;
         case "Miercoles":
             System.out.println("Seria Miercoles");
             break;
         case "Jueves":
             System.out.println("Seria Jueves");
             break;
         case "Viernes":
             System.out.println("Seria Viernes");
             break;
         case "Sabado":
             System.out.println("Seria Sabado");
             break;
         case "Domingo":
             System.out.println("Seria Domingo");
             break;
         default:
             System.out.println("No es un dia valido");
             break;
     }








 }


}
