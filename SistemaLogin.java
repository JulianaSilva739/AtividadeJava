import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        int tentativas = 3;

        while (tentativas > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido! Bem-vindo(a)!");
                return; // Sai do programa
            } else {
                tentativas--;
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null,
                            "Login ou senha incorretos. Você ainda tem " + tentativas + " tentativa(s).");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Login ou senha incorretos. Suas 3 tentativas foram usadas. Acesso bloqueado!");
                }
            }
        }
    }
}
