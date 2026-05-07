package br.com.gestao.funcionarios.application.service;
import br.com.gestao.funcionarios.application.api.FuncionarioRequest;
import br.com.gestao.funcionarios.application.api.FuncionarioResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService{
    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario ");
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario ");
        return null;
    }
}
