public class t08 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 15;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 55;
        numeros[6] = 60;
        numeros[7] = 65;
        numeros[8] = 70;
        numeros[9] = 75;


        int pares = 0;

        System.out.println("Elementos do array:");
        for (int c = 0; c < numeros.length; c++) {
            System.out.println("Elemento " + (c +1) +": " + numeros[c]);

        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares = numeros[i];
                System.out.println("Esse são os números pares " + pares);
            }
        }
    }
}
