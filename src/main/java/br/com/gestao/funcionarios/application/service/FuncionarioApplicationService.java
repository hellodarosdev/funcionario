package br.com.gestao.funcionarios.application.service;

import br.com.gestao.funcionarios.application.api.*;
import br.com.gestao.funcionarios.application.repository.FuncionarioRepository;
import br.com.gestao.funcionarios.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService{
    private final FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioApplicationService - criaFuncionario ");
        Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
        log.info("[finaliza] FuncionarioApplicationService - criaFuncionario ");
        return FuncionarioResponse.builder()
                .id(funcionario.getId())
                .build();
    }

    @Override
    public List<FuncionarioListResponse> buscaTodosFuncionarios() {
        log.info("[inicia] FuncionarioApplicationService - buscaTodosFuncionarios ");
        List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioApplicationService - buscaTodosFuncionarios ");
        return FuncionarioListResponse.converte(funcionarios);
    }

    @Override
    public FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioApplicationService - buscaFuncionarioAtravesId ");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        log.info("[finaliza] FuncionarioApplicationService - buscaFuncionarioAtravesId ");
        return new FuncionarioDetalhadoResponse(funcionario);
    }

    @Override
    public void deletaFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioApplicationService - deletaFuncionarioAtravesId ");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        funcionarioRepository.deletaFuncionario(funcionario);
        log.info("[finaliza] FuncionarioApplicationService - deletaFuncionarioAtravesId ");


    }

    @Override
    public void patchAlteraFuncionario(UUID idFuncionario, FuncionarioAlteracaoRequest funcionarioAlteracaoRequest) {
        log.info("[inicia] FuncionarioApplicationService - patchAlteraFuncionario ");
        Funcionario funcionario = funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario);
        funcionario.altera(funcionarioAlteracaoRequest);
        funcionarioRepository.salva(funcionario);
        log.info("[finaliza] FuncionarioApplicationService - patchAlteraFuncionario ");

    }
}
