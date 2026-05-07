package br.com.gestao.funcionarios.application.api;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.math.BigDecimal;
import java.util.UUID;

@Value
public class FuncionarioRequest {
    private UUID id;
    @NotBlank
    private String nome;
    @NotBlank
    private String designacao;
    @NotBlank
    private BigDecimal salario;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;
    @NotNull
    private Boolean aceitaTermos;
}