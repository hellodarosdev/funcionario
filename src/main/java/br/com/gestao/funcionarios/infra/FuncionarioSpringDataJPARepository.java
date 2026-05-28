package br.com.gestao.funcionarios.infra;

import br.com.gestao.funcionarios.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
    Optional<Funcionario> findById(UUID idFuncionario);
}
