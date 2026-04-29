package dev.PLJStudies.CadastroDeClientes.Clientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientesCrontoller {


    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Página de boas vindas";
    }

    @GetMapping("/BoasVindas")
    public String vtnc() {
        return "Vai tomar no cu";
    }

}
