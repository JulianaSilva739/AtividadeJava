import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        try {
            // Entrada de notas
            String prova1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
            double prova1 = Double.parseDouble(prova1Str.replace(",", "."));

            String prova2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
            double prova2 = Double.parseDouble(prova2Str.replace(",", "."));

            String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");
            double trabalho = Double.parseDouble(trabalhoStr.replace(",", "."));

            // Cálculo da média
            double media = (prova1 + prova2 + trabalho) / 3;

            // Verifica aprovação
            String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

            // Exibe o resultado
            JOptionPane.showMessageDialog(null,
                    "Média: " + String.format("%.2f", media) +
                    "\nResultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: valor inválido! Digite apenas números.");
        }
    }
}
