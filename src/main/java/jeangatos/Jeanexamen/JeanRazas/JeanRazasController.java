package jeangatos.Jeanexamen.JeanRazas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jeanrazas/")
public class JeanRazasController {
    @Autowired
    private JeanRazasServices jeanrazasservice;

    @GetMapping
    public List<JeanRazas> getAll() {
        return jeanrazasservice.jeanFindAll();
    }

    @PostMapping
    public JeanRazas save(@RequestBody JeanRazas razaGato) {
        return jeanrazasservice.save(razaGato);
    }

    @DeleteMapping("/{nombre}")
    public void deleteByNombre(@PathVariable String nombre) {
        jeanrazasservice.deleteByNombre(nombre);
    }
}
