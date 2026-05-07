package br.com.gestao.funcionarios.application.api;

import br.com.gestao.funcionarios.funcionario.domain.Funcionario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    FuncionarioResponse postFuncionario(@RequestBody FuncionarioRequest funcionarioRequest);

    
}