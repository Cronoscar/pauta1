package lenguajes.hn.demo1.Entities;


import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "cuentas")
@Data
public class Cuenta {
    @Id
    @Column(name = "numerocuenta")
    private String numerocuenta;

    @Column(name = "saldo")
    private double saldo;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "sobregiro")
    private boolean sobregiro;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="dni",referencedColumnName = "dni")
    private Cliente cliente;

    @OneToMany(mappedBy = "cuenta",cascade = CascadeType.ALL)
    private List<Movimiento> movimientos;



}

