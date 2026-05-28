package br.com.gestao.funcionarios.application.service;

import br.com.gestao.funcionarios.application.api.*;
import br.com.gestao.funcionarios.application.repository.FuncionarioRepository;
import br.com.gestao.funcionarios.domain.Funcionario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FuncionarioApplicationServiceTest {

    @InjectMocks
    private FuncionarioApplicationService funcionarioApplicationService;

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @Test
    void deveCriarFuncionarioComSucesso() {
        FuncionarioRequest request = mock(FuncionarioRequest.class);

        Funcionario funcionario = mock(Funcionario.class);

        UUID idFuncionario = UUID.randomUUID();

        when(funcionario.getId()).thenReturn(idFuncionario);

        when(funcionarioRepository.salva(any(Funcionario.class))).thenReturn(funcionario);

        FuncionarioResponse response = funcionarioApplicationService.criaFuncionario(request);

        assertNotNull(response);assertEquals(idFuncionario, response.getId());

        verify(funcionarioRepository, times(1)).salva(any(Funcionario.class));
    }

    @Test
    void deveBuscarTodosFuncionariosComSucesso() {
        Funcionario funcionario1 = mock(Funcionario.class);
        Funcionario funcionario2 = mock(Funcionario.class);

        List<Funcionario> funcionarios = List.of(funcionario1, funcionario2);

        when(funcionarioRepository.buscaTodosFuncionarios()).thenReturn(funcionarios);

        List<FuncionarioListResponse> response = funcionarioApplicationService.buscaTodosFuncionarios();

        assertNotNull(response);assertEquals(2, response.size());

        verify(funcionarioRepository, times(1)).buscaTodosFuncionarios();
    }

    @Test
    void deveBuscarFuncionarioPorIdComSucesso() {
        UUID idFuncionario = UUID.randomUUID();

        Funcionario funcionario = mock(Funcionario.class);

        when(funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario)).thenReturn(funcionario);

        FuncionarioDetalhadoResponse response = funcionarioApplicationService.buscaFuncionarioAtravesId(idFuncionario);

        assertNotNull(response);

        verify(funcionarioRepository, times(1)).buscaFuncionarioAtravesId(idFuncionario);
    }

    @Test
    void deveDeletarFuncionarioPorIdComSucesso() {
        UUID idFuncionario = UUID.randomUUID();

        Funcionario funcionario = mock(Funcionario.class);

        when(funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario)).thenReturn(funcionario);

        assertDoesNotThrow(() -> funcionarioApplicationService.deletaFuncionarioAtravesId(idFuncionario));

        verify(funcionarioRepository, times(1)).buscaFuncionarioAtravesId(idFuncionario);

        verify(funcionarioRepository, times(1)).deletaFuncionario(funcionario);
    }

    @Test
    void deveAlterarFuncionarioComSucesso() {
        UUID idFuncionario = UUID.randomUUID();

        FuncionarioAlteracaoRequest request = mock(FuncionarioAlteracaoRequest.class);

        Funcionario funcionario = mock(Funcionario.class);

        when(funcionarioRepository.buscaFuncionarioAtravesId(idFuncionario)).thenReturn(funcionario);

        assertDoesNotThrow(() -> funcionarioApplicationService.patchAlteraFuncionario(idFuncionario, request));

        verify(funcionarioRepository, times(1)).buscaFuncionarioAtravesId(idFuncionario);

        verify(funcionario, times(1)).altera(request);

        verify(funcionarioRepository, times(1)).salva(funcionario);
    }
}
