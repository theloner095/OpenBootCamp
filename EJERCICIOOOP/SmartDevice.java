package EJERCICIOOOP;

public class SmartDevice {
     public static class SmartPhone {
         //Definir atributos
         int bateria;
         String modelo;
         String marca;
         float largo;
         float ancho;
         boolean power;

         //Constructores
        public SmartPhone(String modelox, String marcax, float largox, float anchox, boolean battery){

            this.modelo  = modelox;
            this.marca   = marcax;
            this.largo   = largox;
            this.ancho   = anchox;
            this.power   = battery;
        }



         //Comportamiento
        public void Encendido(){
            if (power == true){
                this.bateria = 100;
                power = false;
            }
        }

         @Override
         public String toString() {
             return "SmartPhone{" +
                     "bateria=" + bateria +
                     ", modelo='" + modelo + '\'' +
                     ", marca='" + marca + '\'' +
                     ", largo=" + largo +
                     ", ancho=" + ancho +
                     '}';
         }
     }



    public static class SmartWatch extends SmartPhone{


        //Definir atributos


        String chapeado;
        int Kilates;




        //Constructores
        public SmartWatch(String chapiado, int Kilatos, String modelox, String marcax, float largox, float anchox, boolean battery) {
            super(modelox, marcax, largox, anchox, battery);
            this.chapeado = chapiado;
            this.Kilates  = Kilatos;
        }


        //Comportamiento


        @Override
        public void Encendido() {
            super.Encendido();
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "chapeado='" + chapeado + '\'' +
                    ", Kilates=" + Kilates +
                    ", bateria=" + bateria +
                    ", modelo='" + modelo + '\'' +
                    ", marca='" + marca + '\'' +
                    ", largo=" + largo +
                    ", ancho=" + ancho +

                    '}';
        }
    }


}

