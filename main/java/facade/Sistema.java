package facade;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> usuariosComNotificacoes = new ArrayList<Usuario>();

    public void addUsuarioNotificacaoPendente(Usuario usuario){
        this.usuariosComNotificacoes.add(usuario);
    }

    public boolean verificarUsuarioNotificacaoPendente(Usuario usuario){
        return this.usuariosComNotificacoes.contains(usuario);
    }
}
