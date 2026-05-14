package br.com.gestao.funcionarios.application.api;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter

public class FuncionarioAlteracaoRequest {
    private UUID id;
    private String nome;
    private String designacao;
    private BigDecimal salario;
    @Column(unique = true)
    private String telefone;
    private String endereco;
    private Boolean aceitaTermos;
}