package br.com.gestao.funcionarios.infra;
import br.com.gestao.funcionarios.application.repository.FuncionarioRepository;
import br.com.gestao.funcionarios.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
    private final FuncionarioSpringDataJPARepository funcionarioSpringDataJPARepository;

    @Override
    public Funcionario salva(Funcionario funcionario){
        log.info("[inicia] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }

}