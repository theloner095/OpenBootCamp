package conInterfaces;

import sinInterfaces.EmpleadoCRUDMySQL;
import sinInterfaces.empleado;
import sinInterfaces.empleadoCRUD;

public class main {

    static empleadoCRUD empleadocrud;

    public static void main(String[] args) {

     empleadocrud.findAll();
     empleadocrud.guardar(new empleado());




    }
}
