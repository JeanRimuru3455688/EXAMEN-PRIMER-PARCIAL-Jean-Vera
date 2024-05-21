package jeangatos.Jeanexamen.Gatos;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jeangatos.Jeanexamen.JeanRazas.JeanRazas;
import lombok.Data;

@Entity
@Data
public class JeanGatos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String nombre;
    private Integer edad;
    private LocalDate fechaNacimiento;
    private boolean vacunado;

    @ManyToOne
    private JeanRazas jeanRazas;
}


