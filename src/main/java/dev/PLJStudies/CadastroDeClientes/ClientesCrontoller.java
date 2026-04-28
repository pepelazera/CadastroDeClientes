package dev.PLJStudies.CadastroDeClientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientesCrontoller {

    @GetMapping
    public String boasVindas() {
        return "Páginda de boas vindas";
    }
}
