package br.com.gestao.funcionarios.application.service;
import br.com.gestao.funcionarios.application.api.FuncionarioRequest;
import br.com.gestao.funcionarios.application.api.FuncionarioResponse;
import br.com.gestao.funcionarios.application.repository.FuncionarioRepository;
import br.com.gestao.funcionarios.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService{
    private final FuncionarioRepository funcionarioRepository;


    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario ");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario ");
        return FuncionarioResponse.builder()
                .id(funcionario.getId())
                .build();
    }
}
