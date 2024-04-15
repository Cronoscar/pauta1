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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion")
    private String iddireccion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "calle")
    private String calle;

    @OneToOne
    @JoinColumn(name = "dni",referencedColumnName = "dni")
    private Cliente cliente;
}
