package sinInterfaces;
import java.util.ArrayList;
import java.util.List;
public class empleadoCRUD {

    List<empleado> Empleados = new ArrayList<>();


    public void guardar(empleado Empleadoss){
            Empleados.add(Empleadoss);

        }
        public List<empleado> findAll(){
        return Empleados;


        }

}
