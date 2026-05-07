package br.com.gestao.funcionarios.funcionario.domain;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
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


    public Funcionario(Boolean aceitaTermos, String designacao, String endereco, String nome,
                       BigDecimal salario, String telefone) {
        this.aceitaTermos = aceitaTermos;
        this.designacao = designacao;
        this.endereco = endereco;
        this.nome = nome;
        this.salario = salario;
        this.telefone = telefone;
    }
}
