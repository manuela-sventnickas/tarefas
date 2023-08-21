import javax.swing.*;

public class t05 {
    public static void main(String[] args) {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3", "Opção 4", "Opção 5", "Opção 6", "Opção 7"};

        int resposta = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0] // Opção padrão selecionada
        );

        switch (resposta) {
            case 0:
                JOptionPane.showMessageDialog(null, "Domingo", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
        }
    }
}