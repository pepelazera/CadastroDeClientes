package dev.PLJStudies.CadastroDeClientes.Cadastros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CadastroController {

    @GetMapping("/cadastro")
    public String telaCadastro() {
        return "Você está na primeira tela da aba de cadastros";
    }

}
