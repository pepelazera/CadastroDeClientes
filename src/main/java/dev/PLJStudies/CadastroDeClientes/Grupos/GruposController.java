package dev.PLJStudies.CadastroDeClientes.Grupos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GruposController {

    @GetMapping(name = "/grupos")
    public String telaGrupos() {
        return "Primeira aba da tela de grupos";
    }

}
