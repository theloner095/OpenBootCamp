package refactorizar.magicNumbers;

public class main {

    //Se crean constantes
    private static final double PRECIO_MINIMO = 100;
    private static final double PRECIO_ENVIO = 4.99;
    private static final double ENVIO_GRATIS = 0.10;
    private static final double PRECIO_DESCUENTO = 0.20;


    //Main
    public static void main(String[] args) {
        double price = 129.99;
        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);

    }

    //Metodos
    private static double calculateShipping(double price){
        return price < PRECIO_MINIMO ? PRECIO_ENVIO : ENVIO_GRATIS; //Hard Coded
    }
    private static double calculateDiscount(double price){
    return price * PRECIO_DESCUENTO;    }

}
