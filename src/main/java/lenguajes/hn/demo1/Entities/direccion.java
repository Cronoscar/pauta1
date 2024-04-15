package lenguajes.hn.demo1.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="direccion")
@Data
public class direccion {
    @Id
    @Column(name = "iddireccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idDireccion;

    @Column(name = "estado")
    private double estado;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "calle")
    private boolean calle;

    @OneToOne
    @JoinColumn(name = "dni",referencedColumnName = "dni")
    private Cliente cliente;
}
