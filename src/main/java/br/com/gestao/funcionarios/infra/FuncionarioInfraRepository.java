package br.com.gestao.funcionarios.infra;
import br.com.gestao.funcionarios.application.repository.FuncionarioRepository;
import br.com.gestao.funcionarios.domain.Funcionario;
import br.com.gestao.funcionarios.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public List<Funcionario> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
      List<Funcionario> todosFuncionarios =  funcionarioSpringDataJPARepository.findAll();
        log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
        return todosFuncionarios;
    }

    @Override
    public Funcionario buscaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioInfraRepository - buscaFuncionarioAtravesId");
        Funcionario funcionario = funcionarioSpringDataJPARepository.findById(idFuncionario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionário não encontrado!"));
        log.info("[finaliza] FuncionarioInfraRepository - buscaFuncionarioAtravesId");
        return funcionario;
    }

    @Override
    public void deletaFuncionario(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - deletaFuncionario");
        funcionarioSpringDataJPARepository.delete(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - deletaFuncionario");
    }

}