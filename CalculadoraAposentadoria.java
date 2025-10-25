import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        try {
            // Entrada de dados
            String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
            int idade = Integer.parseInt(idadeStr);

            String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):").toUpperCase();

            String contribuicaoStr = JOptionPane.showInputDialog("Digite seus anos de contribuição:");
            int contribuicao = Integer.parseInt(contribuicaoStr);

            // Definição de regras (exemplo simples)
            int idadeMinimaHomem = 65;
            int idadeMinimaMulher = 62;
            int tempoContribuicaoHomem = 35;
            int tempoContribuicaoMulher = 30;

            boolean podeAposentar = false;
            int anosFaltantes = 0;

            if (sexo.equals("M")) {
                if (idade >= idadeMinimaHomem || contribuicao >= tempoContribuicaoHomem) {
                    podeAposentar = true;
                } else {
                    anosFaltantes = Math.max(idadeMinimaHomem - idade, tempoContribuicaoHomem - contribuicao);
                }
            } else if (sexo.equals("F")) {
                if (idade >= idadeMinimaMulher || contribuicao >= tempoContribuicaoMulher) {
                    podeAposentar = true;
                } else {
                    anosFaltantes = Math.max(idadeMinimaMulher - idade, tempoContribuicaoMulher - contribuicao);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido! Digite M ou F.");
                return;
            }

            // Resultado
            if (podeAposentar) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você já pode se aposentar.");
            } else {
                JOptionPane.showMessageDialog(null, "Você ainda precisa contribuir por " + anosFaltantes + " ano(s) para se aposentar.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: valor inválido! Digite apenas números.");
        }
    }
}
