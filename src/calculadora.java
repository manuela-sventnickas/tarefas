import javax.swing.*;

public class calculadora {
    public static void main(String[] args) {
        Integer inteiro = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro);
        Integer inteiro2 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro2);

        int soma = inteiro + inteiro2;
        System.out.println("O resultado da soma é " + soma);
    }
}
