package br.com.gestao.funcionarios.application.api;
import br.com.gestao.funcionarios.domain.Funcionario;
import lombok.Value;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private UUID id;
    private String nome;
    private String designacao;
    private String telefone;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse :: new)
                .collect(Collectors.toList())
        ;
    }

    public FuncionarioListResponse(Funcionario funcionario) {
        this.designacao = funcionario.getDesignacao();
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.telefone = funcionario.getTelefone();
    }
}