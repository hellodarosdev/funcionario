package br.com.gestao.funcionarios.application.service;

import br.com.gestao.funcionarios.application.api.FuncionarioListResponse;
import br.com.gestao.funcionarios.application.api.FuncionarioRequest;
import br.com.gestao.funcionarios.application.api.FuncionarioResponse;

import java.util.List;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscaTodosFuncionarios();
}