import javax.swing.*;

public class t06 {
    public static void main(String[] args) {
        Integer inteiro = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro);
        Integer inteiro2 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(inteiro2);

        try {

            int soma = inteiro + inteiro2;
            int subtracao = inteiro - inteiro2;
            int divisao = inteiro / inteiro2;
            int multiplicacao = inteiro * inteiro2;
            System.out.println("O resultado da soma é " + soma);
            System.out.println("O resultado da subtração é " + subtracao);
            System.out.println("O resultado da divisão é " + divisao);
            System.out.println("O resultado da multiplicação é " + multiplicacao);

        } catch (ArithmeticException e) {
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }
    }
}