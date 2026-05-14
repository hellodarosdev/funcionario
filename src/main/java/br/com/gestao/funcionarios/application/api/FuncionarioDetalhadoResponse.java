package br.com.gestao.funcionarios.application.api;
import br.com.gestao.funcionarios.domain.Funcionario;
import java.math.BigDecimal;
import java.util.UUID;

public class FuncionarioDetalhadoResponse {
    private UUID id;
    private String nome;
    private String designacao;
    private BigDecimal salario;
    private String telefone;
    private String endereco;

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.designacao = funcionario.getDesignacao();
        this.endereco = funcionario.getEndereco();
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
    }
}