package lenguajes.hn.demo1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lenguajes.hn.demo1.Entities.Cliente;
import lenguajes.hn.demo1.Services.ClienteService;
import lenguajes.hn.demo1.Services.Implements.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    
    @PostMapping("/")
    public String crearNuevoCliente (@RequestBody Cliente cliente){
        return this.clienteServiceImpl.crearCliente(cliente);
    }
}
