package facade;

public class Usuario {

    public boolean entrar(){
        return UsuarioFacade.verificarContaUsuario(this);
    }
}
