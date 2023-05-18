package EJERCICIOOOP;
import EJERCICIOOOP.SmartDevice;
public class main {
    public static void main(String[] args){


        // Instanciar clases y crear objetos
         SmartDevice.SmartPhone intelifon   = new SmartDevice.SmartPhone("iphone 6s Plus", "Apple", 16.4f, 8.4f,true);


         SmartDevice.SmartWatch intelireloj = new SmartDevice.SmartWatch("Oro", 5, "Samsung XV", "Samsung", 7.5f, 4.3f, true);



        intelifon.Encendido();
        intelireloj.Encendido();

        System.out.println(intelifon);
        System.out.println(intelireloj);



    }


}
