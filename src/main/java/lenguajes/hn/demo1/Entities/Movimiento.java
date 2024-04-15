package lenguajes.hn.demo1.Entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="movimientos")
@Data
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idmovimiento;
    @Column(name = "tipomovimiento")
    private char tipoMovimiento;

    @Column(name = "monto")
    private double monto;

    @Column(name = "fechamovimiento")
    private LocalDate fechaMovimiento;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "numerocuenta",referencedColumnName = "numerocuenta")
    private Cuenta cuenta;




}
