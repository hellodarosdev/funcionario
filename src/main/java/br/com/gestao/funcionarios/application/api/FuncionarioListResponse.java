package br.com.gestao.funcionarios.application.api;
import br.com.gestao.funcionarios.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public class FuncionarioListResponse {
    private UUID id;
    private String nome;
    private String designacao;
    private String telefone;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return null;
    }
}