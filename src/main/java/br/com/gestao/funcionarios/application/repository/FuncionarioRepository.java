package br.com.gestao.funcionarios.application.repository;
import br.com.gestao.funcionarios.domain.Funcionario;
import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {

    Funcionario salva(Funcionario funcionario);

    List<Funcionario> buscaTodosFuncionarios();

    Funcionario buscaFuncionarioAtravesId(UUID idFuncionario);
}