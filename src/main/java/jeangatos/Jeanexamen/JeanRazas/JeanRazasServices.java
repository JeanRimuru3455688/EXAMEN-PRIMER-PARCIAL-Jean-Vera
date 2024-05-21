package jeangatos.Jeanexamen.JeanRazas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class JeanRazasServices {
    @Autowired
    private JeanRazasRepository jeanRazasRepository;

    public List<JeanRazas> jeanFindAll() {
        Iterable<JeanRazas> iterable = jeanRazasRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

    public JeanRazas save(JeanRazas razaGato) {
        return jeanRazasRepository.save(razaGato);
    }

    public void deleteByNombre(String nombre) {
        jeanRazasRepository.deleteByNombre(nombre);
    }
}
