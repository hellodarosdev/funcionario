package br.com.gestao.funcionarios.application.api;
import br.com.gestao.funcionarios.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
    private final FuncionarioService funcionarioService;


    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioController - postFuncionario ");
        FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioRequest);
        log.info("[finaliza] FuncionarioController - postFuncionario ");
        return funcionarioCriado;
    }

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[inicia] FuncionarioController - getTodosFuncionarios ");
        List<FuncionarioListResponse> funcionarios = funcionarioService.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioController - getTodosFuncionarios ");
        return funcionarios;
    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - getFuncionarioAtravesId ");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhado = funcionarioService.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finaliza] FuncionarioController - getFuncionarioAtravesId ");
        return funcionarioDetalhado;
    }

    @Override
    public void deletaFuncionarioAtravesId(UUID idFuncionario) {
            log.info("[inicia] FuncionarioController - deletaFuncionarioAtravesId");
            log.info("[idCliente] {}", idFuncionario);
            funcionarioService.deletaFuncionarioAtravesId(idFuncionario);
            log.info("[finaliza] FuncionarioController - deletaFuncionarioAtravesId");

    }


}