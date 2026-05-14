package br.com.gestao.funcionarios.application.api;
import lombok.Builder;
import lombok.Value;
import java.util.UUID;

@Value
@Builder
public class FuncionarioResponse {
    private UUID id;

}