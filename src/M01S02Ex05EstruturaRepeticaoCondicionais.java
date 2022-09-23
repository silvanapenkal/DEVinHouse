import java.util.Arrays;
import java.util.Scanner;

public class M01S02Ex05EstruturaRepeticaoCondicionais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você quer colocar? ");
        int size = scanner.nextInt();
        System.out.println("Insert "+size+" Elements of the Array");

        int[] numeros = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Numero "+i+" : ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Números fornecidos:" + Arrays.toString(numeros));

        int maior= numeros[0];
        int menor= numeros[0];

        for (int i= 0; i< numeros.length;i++){
            if (menor>numeros[i]){
                menor= numeros[i];
            }
            if (maior<numeros[i]){
                maior= numeros[i];
            }
        }

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
    }
}
