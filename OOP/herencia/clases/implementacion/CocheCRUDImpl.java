package OOP.herencia.clases.implementacion;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements cocheCRUD{
    List<vehiculo> vehiculos = new ArrayList<>();
    @Override
    public void save(vehiculo carros) {
        vehiculos.add(carros);
    }

    @Override
    public List<vehiculo> findAll() {
        return vehiculos;
    }

    @Override
    public void delete(vehiculo carrosDelete) {

        vehiculos.remove(carrosDelete);
        System.out.println("Borrando el carro: " + carrosDelete);
    }
}
