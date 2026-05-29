package br.com.gestao.funcionarios.application.api;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FuncionarioAlteracaoRequest {
    private String nome;
    private String designacao;
    private BigDecimal salario;
    private String telefone;
    private String endereco;
    private Boolean aceitaTermos;
}
