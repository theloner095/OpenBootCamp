package refactorizar.extractvariable;


public class Main {


    void printProductPrice(Order order){
        //Calcular precio total

        //1. Precio de los productos

        double Price = order.getPrice() * order.getQuantity();

        //2. Comprobar el descuento
        double descPrice = order.getPrice() * order.getOfferPrice();

        //3. Calcular precio productos con el descuento incluido
        double totalPrice = Price - descPrice;

        //4. Precio de envio
        double shippingCost = 0.0;
        if(totalPrice < 50){
            shippingCost = 2.99;
        }else{shippingCost = 0.0;}
        //5. restar el shipping cost al precio total

        double finalPrice = totalPrice - shippingCost;


        //6. Imprimir el precio final
        System.out.println(finalPrice);



    }




    public static void main(String[] args){



    }
}
