package jeangatos.Jeanexamen.Gatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JeanGatosService {
    @Autowired
    private JeanGatosRepository jeangatosRepository;

    public JeanGatos jeansave(JeanGatos entity) {
        return jeangatosRepository.save(entity);
    }

    public JeanGatos jeanfindById(long id) {
        return jeangatosRepository.findById(id).orElse(null);
    }

    public List<JeanGatos> jeanfindAll() {
        return (List<JeanGatos>) jeangatosRepository.findAll();
    }

    public void jeandeleteById(long id) {
        jeangatosRepository.deleteById(id);
    }

    public void jeandeleteByNombre(String nombre) {
        jeangatosRepository.deleteByNombre(nombre);
    }
}
