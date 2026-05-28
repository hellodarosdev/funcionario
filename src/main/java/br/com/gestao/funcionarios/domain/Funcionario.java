package br.com.gestao.funcionarios.domain;

import br.com.gestao.funcionarios.application.api.FuncionarioAlteracaoRequest;
import br.com.gestao.funcionarios.application.api.FuncionarioRequest;
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
    @Column(columnDefinition = "uuid", name = "idFuncionario", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotBlank
    private String nome;
    @NotBlank
    private String designacao;
    private BigDecimal salario;
    @NotBlank
    @Column(unique = true)
    private String telefone;
    @NotBlank
    private String endereco;
    @NotNull
    private Boolean aceitaTermos;


    public Funcionario(FuncionarioRequest funcionarioRequest){
        this.aceitaTermos = funcionarioRequest.getAceitaTermos();
        this.designacao = funcionarioRequest.getDesignacao();
        this.endereco = funcionarioRequest.getEndereco();
        this.nome = funcionarioRequest.getNome();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();
    }

    public void altera(FuncionarioAlteracaoRequest funcionarioRequest) {
        this.aceitaTermos = funcionarioRequest.getAceitaTermos();
        this.designacao = funcionarioRequest.getDesignacao();
        this.endereco = funcionarioRequest.getEndereco();
        this.nome = funcionarioRequest.getNome();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();
    }
}
