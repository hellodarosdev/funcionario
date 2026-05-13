package br.com.gestao.funcionarios.application.api;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

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
