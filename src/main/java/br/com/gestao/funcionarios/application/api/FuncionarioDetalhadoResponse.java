package br.com.gestao.funcionarios.application.api;
import java.math.BigDecimal;
import java.util.UUID;

public class FuncionarioDetalhadoResponse {
    private UUID id;
    private String nome;
    private String designacao;
    private BigDecimal salario;
    private String telefone;
    private String endereco;
}