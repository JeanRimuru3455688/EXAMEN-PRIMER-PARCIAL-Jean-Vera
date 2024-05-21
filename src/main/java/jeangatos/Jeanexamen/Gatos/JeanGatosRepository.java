package jeangatos.Jeanexamen.Gatos;

import org.springframework.data.repository.CrudRepository;

public interface JeanGatosRepository extends CrudRepository<JeanGatos, Long> {
    void deleteByNombre(String nombre);
}

