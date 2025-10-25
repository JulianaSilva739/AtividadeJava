import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        try {
            // Entrada de dados
            String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
            double valorTransacao = Double.parseDouble(valorTransacaoStr.replace(",", "."));

            String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
            double valorVenal = Double.parseDouble(valorVenalStr.replace(",", "."));

            String porcentagemITBIStr = JOptionPane.showInputDialog("Digite a porcentagem do ITBI:");
            double porcentagemITBI = Double.parseDouble(porcentagemITBIStr.replace(",", "."));

            // Calcula o valor base (maior entre transação e venal)
            double baseCalculo = Math.max(valorTransacao, valorVenal);

            // Calcula o imposto
            double imposto = baseCalculo * (porcentagemITBI / 100);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "O valor do ITBI é: R$ " + String.format("%.2f", imposto));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: valor inválido! Digite apenas números.");
        }
    }
}
