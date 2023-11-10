import org.junit.Test;
import static org.junit.Assert.*;

public class LoginScreenTest {

    @Test
    public void testAutenticarUsuario() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.autenticar("usuario", "senha"));
    }

    @Test
    public void testAutenticarUsuarioIncorreto() {
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.autenticar("usuarioIncorreto", "senha"));
    }
}
