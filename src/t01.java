public class t01 {
    public static void main(String[] args) {
        String texto = "Olá, mundo!";

        // Obtendo o tamanho da String
        int tamanho = texto.length();
        if (tamanho > 50) {
            System.out.println("Frase longa! " + tamanho);
        } else if (tamanho< 50) {
            System.out.println("Frase curta!" + tamanho);
        }
    }
}
