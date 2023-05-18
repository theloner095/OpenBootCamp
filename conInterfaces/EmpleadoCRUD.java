package conInterfaces;

import sinInterfaces.empleado;
import java.util.List;
public interface EmpleadoCRUD {

    //Se declaran los metodos no se implementan
    void save(empleado Empleado);

    List<empleado> findAll();

    void delete(empleado Empleado);
}
