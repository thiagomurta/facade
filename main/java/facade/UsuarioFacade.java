package facade;

public class UsuarioFacade {

    public static boolean verificarContaUsuario(Usuario usuario){
        if(Compra.getInstancia().verificarUsuarioNotificacaoPendente(usuario)){
            return false;
        }
        if(Seguranca.getInstancia().verificarUsuarioNotificacaoPendente(usuario)){
            return false;
        }
        if(Pagamento.getInstancia().verificarUsuarioNotificacaoPendente(usuario)){
            return false;
        }
        return true;
    }
}
