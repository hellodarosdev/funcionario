package br.com.gestao.funcionarios.application.service;

import br.com.gestao.funcionarios.application.api.FuncionarioDetalhadoResponse;
import br.com.gestao.funcionarios.application.api.FuncionarioListResponse;
import br.com.gestao.funcionarios.application.api.FuncionarioRequest;
import br.com.gestao.funcionarios.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscaTodosFuncionarios();

    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);
}