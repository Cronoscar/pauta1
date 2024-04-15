package lenguajes.hn.demo1.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import lenguajes.hn.demo1.Entities.Cliente;

public interface ClienteRepositori extends JpaRepository<Cliente,String> {

    
}
