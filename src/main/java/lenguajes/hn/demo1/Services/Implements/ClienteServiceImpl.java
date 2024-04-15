package lenguajes.hn.demo1.Services.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lenguajes.hn.demo1.Entities.Cliente;
import lenguajes.hn.demo1.Repositorios.ClienteRepositori;
import lenguajes.hn.demo1.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepositori clienteRepositori;
    @Override
    public String crearCliente(Cliente nuevoCliente) {
        this.clienteRepositori.save(nuevoCliente);
        return "se agrego cliente" ;
    }
    
}
