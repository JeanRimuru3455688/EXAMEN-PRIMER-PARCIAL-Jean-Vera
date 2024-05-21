package jeangatos.Jeanexamen.Gatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jeangatos")
public class JeanGatosController {
    @Autowired
    private JeanGatosService jeangatosService;

    @PostMapping("/")
    public JeanGatos jeansave(@RequestBody JeanGatos entity) {
        return jeangatosService.jeansave(entity);
    }

    @GetMapping("/{id}")
    public JeanGatos jeanfindById(@PathVariable long id) {
        return jeangatosService.jeanfindById(id);
    }

    @GetMapping("/aaa")
    public List<JeanGatos> jeanfindAll() {
        return jeangatosService.jeanfindAll();
    }

    @PutMapping("/up")
    public JeanGatos jeanupdate(@RequestBody JeanGatos entity) {
        return jeangatosService.jeansave(entity);
    }

    @DeleteMapping("/{id}/")
    public void jeandeleteById(@PathVariable long id) {
        jeangatosService.jeandeleteById(id);
    }

    @DeleteMapping("/nombre/{nombre}")
    public void jeandeleteByNombre(@PathVariable String nombre) {
        jeangatosService.jeandeleteByNombre(nombre);
    }
}
