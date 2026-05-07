package br.com.gestao.funcionarios.funcionario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Entity
public class Funcionario {
    @Id
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


    public Funcionario(Boolean aceitaTermos, String designacao, String endereco, int id, String nome, BigDecimal salario, String telefone) {
        this.aceitaTermos = aceitaTermos;
        this.designacao = designacao;
        this.endereco = endereco;
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }
}
