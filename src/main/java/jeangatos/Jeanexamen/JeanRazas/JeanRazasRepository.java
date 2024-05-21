package jeangatos.Jeanexamen.JeanRazas;

import org.springframework.data.repository.CrudRepository;

public interface JeanRazasRepository extends CrudRepository<JeanRazas, Long>{
    void deleteByNombre(String nombre);
}