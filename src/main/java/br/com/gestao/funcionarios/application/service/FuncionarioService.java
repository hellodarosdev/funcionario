package br.com.gestao.funcionarios.application.service;
import br.com.gestao.funcionarios.application.api.*;
import java.util.List;
import java.util.UUID;

public interface FuncionarioService {

    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscaTodosFuncionarios();

    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);

    void deletaFuncionarioAtravesId(UUID idFuncionario);

    void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest);
}