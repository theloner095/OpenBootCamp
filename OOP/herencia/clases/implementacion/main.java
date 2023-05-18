package OOP.herencia.clases.implementacion;

public abstract class main {
    public static void main(String[] args){


        //Crear un objeto cochecrudimpl
        cocheCRUD cochecrud = new CocheCRUDImpl();






        //Definir motores
        Motor motorNormal    = new Motor("Combustion", 6);
        Motor motorElectrico = new Motor("Electrico", 0);
        Motor motorTrailer   = new Motor("Combustion grande", 24);
        Motor motormoto      = new Motor("Combustion chico", 3);


        //Crear objetos

        vehiculo ford  = new vehiculo("manual", "ford", 2.1d, 2010, 4, "Verde", false, motorNormal);
        vehiculo teslaElectrico = new vehiculo("Autonomo", "Tesla", 3.1d, 2023,2,"Blanco", true,motorElectrico);
        moto cuatrimoto = new moto("Zuzaki", "Japon", 200d, 2023, 0, "Green", true, motormoto);
        Camion camion = new Camion("Alvarez", "China", 60d, 1998, 2, "Verde", false, motorTrailer, true);
        vehiculo motoCarro = new moto();


        //Guardar los vehiculos
        cochecrud.save(ford);
        cochecrud.save(teslaElectrico);
        cochecrud.save(cuatrimoto);
        cochecrud.save(camion);
        cochecrud.save(motoCarro);


        //Mostrar
        cochecrud.delete(ford);
        System.out.println(cochecrud.findAll());




        // Comportamiento







        /*Ver en pantalla

        System.out.println(ford);

        System.out.println(teslaElectrico);

        System.out.println(cuatrimoto);

        System.out.println(camion);
        */
    }
}
