public class t07 {
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

        int maior = 0;
        int menor = 9999;
        int soma = 0;

        System.out.println("Elementos do array:");
            for (int c = 0; c < numeros.length; c++) {
            System.out.println("Elemento " + (c + 1) + ": " + numeros[c]);

        }
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];

                }
                if (numeros[i] < menor) {
                    menor = numeros[i];

                }
                soma+= numeros[i];
            }
                double media = (double) soma / numeros.length;
                System.out.println("A média dos números é: " + media);
                System.out.println("Esse é o maior número: " + maior);
                System.out.println("Esse é o menor número: " + menor);
         }
    }



