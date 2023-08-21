public class t03 {
    public static void main(String[] args) {
        String texto = "Desenvolvimento é muito legal!";

        // Substituindo e convertendo para maiúsculas
        String nova = texto.replace("Desenvolvimento", "Programação").toUpperCase();

        System.out.println(nova);
    }
}
