package br.com.gestao.funcionarios.application.repository;

import br.com.gestao.funcionarios.funcionario.domain.Funcionario;

public interface FuncionarioRepository {

    Funcionario salva(Funcionario funcionario);
}
