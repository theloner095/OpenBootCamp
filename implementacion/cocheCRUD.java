package OOP.herencia.clases.implementacion;

import java.util.List;

public interface cocheCRUD {


    void save(vehiculo carros);
    List<vehiculo> findAll();
    void delete(vehiculo carrosDelete);






}
