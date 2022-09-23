import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesafioM01S02A01 {

    public static void main (String[] args){

        //Desafio 1

        String[] cores = {"vermelho", "preto", "branco","roxo", "azul", "amarelo"};

        int tamanhoCores = cores.length;
        System.out.println(tamanhoCores);
        System.out.println(cores[2]);
        System.out.println(cores[0]);
        System.out.println(cores[tamanhoCores-1]);

        //Desafio 2


        String [][] multicores = {
                {"vermelho","preto","branco"},
                {"roxo","azul"}
        };

        System.out.println(multicores [0][0]);
        System.out.println(multicores [1][0]);
        System.out.println(multicores.length);
        System.out.println(multicores [1].length);

        //Desafio 3

        //Com base no que vimos sobre arrays, crie uma array de tamanho 5 e tipo “int”.
        // Em seguida, adicione os números de 1 a 5 em ordem sequencial.

        int[] numeros = new int[5];
        numeros [0]= 1;
        numeros [1]= 2;
        numeros [2]= 3;
        numeros [3]= 4;
        numeros [4]= 5;
        System.out.println(numeros[2]);
       //int numeros = {1,2,3,4,5}



        List<Integer> nomes = Arrays.asList(1,2,3,4);
        System.out.println("1 - Primeira Opção");
        System.out.println("2 - Segunda Opção");
        System.out.println("3 - Terceira Opção");
        System.out.println("4 - Quarta Opção");
        System.out.println("Digite a opção desejada: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        System.out.println("Opção válida: "+nomes.contains(opcao));


    }


}
