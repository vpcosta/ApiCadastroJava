package dev.vpcosta7.CadastroDeNinjas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Essa é uma rota da minha aplicação!";
    }
}
