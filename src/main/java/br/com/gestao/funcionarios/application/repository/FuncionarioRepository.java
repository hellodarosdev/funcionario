package br.com.gestao.funcionarios.application.repository;
import br.com.gestao.funcionarios.domain.Funcionario;
import java.util.List;

public interface FuncionarioRepository {

    Funcionario salva(Funcionario funcionario);

    List<Funcionario> buscaTodosFuncionarios();
}
