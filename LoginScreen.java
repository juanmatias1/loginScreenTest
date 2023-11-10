/**
 * Classe para a tela de login.
 */
public class LoginScreen {

    /**
     * Autentica o usuário e senha.
     * @param usuario O nome do usuário.
     * @param senha A senha do usuário.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    public boolean autenticar(String usuario, String senha) {
        // Lógica de autenticação aqui
        return "usuario".equals(usuario) && "senha".equals(senha);
    }
}
