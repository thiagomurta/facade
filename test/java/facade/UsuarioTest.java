package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveRetornarNotificacaoPagamento(){
        Usuario usuario = new Usuario();
        Pagamento.getInstancia().addUsuarioNotificacaoPendente(usuario);

        assertFalse(usuario.entrar());
    }

    @Test
    void deveRetornarNotificacaoCompra(){
        Usuario usuario = new Usuario();
        Pagamento.getInstancia().addUsuarioNotificacaoPendente(usuario);

        assertFalse(usuario.entrar());
    }

    @Test
    void deveRetornarNotificacaoSeguranca(){
        Usuario usuario = new Usuario();
        Pagamento.getInstancia().addUsuarioNotificacaoPendente(usuario);

        assertFalse(usuario.entrar());
    }

    @Test
    void deveRetornarUsuarioSemNotificacoes(){
        Usuario usuario = new Usuario();

        assertTrue(usuario.entrar());
    }
}