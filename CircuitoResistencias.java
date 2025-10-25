import javax.swing.JOptionPane;

public class CircuitoResistencias {
    public static void main(String[] args) {
        try {
            // Entrada das resistências
            double[] resistencias = new double[4];
            for (int i = 0; i < 4; i++) {
                String input = JOptionPane.showInputDialog("Digite o valor da resistência " + (i + 1) + " (em ohms):");
                resistencias[i] = Double.parseDouble(input.replace(",", "."));
            }

            // Cálculo da resistência equivalente (série)
            double equivalente = 0;
            double maior = resistencias[0];
            double menor = resistencias[0];

            for (double r : resistencias) {
                equivalente += r;
                if (r > maior) maior = r;
                if (r < menor) menor = r;
            }

            // Exibição dos resultados
            JOptionPane.showMessageDialog(null,
                    "Resistência equivalente: " + String.format("%.2f", equivalente) + " Ω" +
                    "\nMaior resistência: " + String.format("%.2f", maior) + " Ω" +
                    "\nMenor resistência: " + String.format("%.2f", menor) + " Ω");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: valor inválido! Digite apenas números.");
        }
    }
}
