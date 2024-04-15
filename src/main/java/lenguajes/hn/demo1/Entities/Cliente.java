package lenguajes.hn.demo1.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name= "cliente")
@Data

public class Cliente {
    @Id
    @Column(name="dni")
    private String dni;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    @Column(name="telefono")
    private String telefono;

    @JsonIgnore
    @OneToOne(mappedBy = "cliente")
    private direccion direccion;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
    private List<Cuenta> cuentas;
}
