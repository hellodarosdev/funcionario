package br.com.gestao.funcionarios.application.api;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.math.BigDecimal;
import java.util.UUID;

@Value
public class FuncionarioRequest {
    @NotBlank
    private String nome;
    private String designacao;
    private BigDecimal salario;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;
    @NotNull
    private Boolean aceitaTermos;
}