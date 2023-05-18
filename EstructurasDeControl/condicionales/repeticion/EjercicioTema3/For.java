package EstructurasDeControl.condicionales.repeticion;

public class For {
    public static void main(String[] args){
            // Declarar variables



        String[] nombre = {"Oliver", "Kevin", "Brandon", "Brian"};

        String texto = "";


        //Bucle
        for(int i = 0; i < nombre.length; i++){

            texto += nombre[i] + " ";




        }
        System.out.println(texto);
    }



}
