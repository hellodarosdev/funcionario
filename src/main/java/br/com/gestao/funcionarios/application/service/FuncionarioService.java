package br.com.gestao.funcionarios.application.service;

import br.com.gestao.funcionarios.application.api.FuncionarioRequest;
import br.com.gestao.funcionarios.application.api.FuncionarioResponse;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}