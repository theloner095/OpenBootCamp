package sinInterfaces;
import java.util.List;

public class main {

    public static void main(String[] args){


        //Crear EmpleadoCRUD
        empleadoCRUD empleadocrud = new empleadoCRUD();


        //Crear nuevos empleados
        empleado Kevin = new empleado(23, "Kevin", 1200, false);
        empleado Carlos = new empleado(21, "Carlos", 1200, false);
        empleado juanito = new empleado(25, "Juanito", 1200, false);
        empleado Mariana = new empleado(27, "Mariana", 1200, false);

        //Guardar empleados
        empleadocrud.guardar(juanito);
        empleadocrud.guardar(Kevin);
        empleadocrud.guardar(Carlos);
        empleadocrud.guardar(Mariana);






        //Consultar empleados

        List<empleado> dataBase = empleadocrud.findAll();

        System.out.println(dataBase.get(1));

    }
}
