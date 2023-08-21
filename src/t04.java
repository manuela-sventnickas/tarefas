import javax.swing.*;

public class t04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Entrada", JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Entrada", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nome + sobrenome, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}


