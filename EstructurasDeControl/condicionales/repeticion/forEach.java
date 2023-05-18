package EstructurasDeControl.condicionales.repeticion;

public class forEach {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5};
        String[] nombres = {"Oliver", "Kevin", "Brian"};



        //Bucle forEach con String
        for(String nombre : nombres){
            String texto = nombre;
            System.out.println(texto);


        }
        //Bucle forEach con enteros
        for (int numero : numeros){
            numero = numero * 2;

            System.out.println(numero);
        }


    }



}
