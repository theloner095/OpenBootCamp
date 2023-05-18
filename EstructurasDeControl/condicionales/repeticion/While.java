package EstructurasDeControl.condicionales.repeticion;

public class While {
    public static void main(String[] args){
        int[] numeros    = {1,2,3,4,5};
        String[] nombres = {"Oliver", "Kevin", "Brian", "Brandon"};
        int contador = 0;







        while (contador < 10){
            contador += 1;


            if(contador == 5 || contador == 6){
                continue;
            }

            System.out.println("El contador va en el numero " + contador);
        }






    }

}
