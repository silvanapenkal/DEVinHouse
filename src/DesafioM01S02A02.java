import java.util.Scanner;

public class DesafioM01S02A02 {

    public static void main (String[] args) {

        // Dado uma idade, calcular se é maior de idade caso idade >= 18 anos;

        int idade = 15;

//        if (idade >= 18) {
//            System.out.println("Maior de idade!");
//        } else {
//            System.out.println("Menor de idade!");
//        }

        String resultadoIdade = idade >=18 ? "maior de idade":"menor de idade";
        System.out.println(resultadoIdade);

        //Calcular média de notas e imprimir se aprovado (média >= 7);

        double[] notas = {6, 5};
        double media = (notas[0] + notas[1]) / 2;
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        //Dado uma variável String como uma das cores do semáforo: vermelho, amarelo e verde,
        //implemente um código que imprima a frase correspondente:
        //“vermelho” = “Deve parar o carro!”
        //“amarelo” = “Deve finalizar travessia!”
        //“verde” = “Pode passar!”;
        //Exemplo:   String cor = “vermelho”;  …
        //usar if ….   ou   switch..case

        String cor = "vermelho";

        switch (cor) {
            case "vermelho":
                System.out.println("Deve parar o carro!");
                break;
            case "verde":
                System.out.println("Pode passar!");
                break;
            case "amarelo":
                System.out.println("Deve finalizar travessia!");
                break;
        }

        //IMC: “divide-se o peso do paciente pela sua altura elevada ao quadrado” ⇒  IMC = peso / (altura x altura)
        //Resultados:
        //IMC	CLASSIFICAÇÃO
        //MENOR QUE 18,5	MAGREZA
        //ENTRE 18,5 E 24,9	NORMAL
        //ENTRE 25,0 E 29,9	SOBREPESO
        //ENTRE 30,0 E 39,9	OBESIDADE
        //MAIOR QUE 40,0	OBESIDADE GRAVE
        //* Fonte: https://www.programasaudefacil.com.br/calculadora-de-imc

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();

     //   float altura = 1.83f;
        float peso = 74f;
        float imc = peso / (altura*altura) ;
        System.out.println("imc" + imc);
        String resultado;

        if (imc < 18.5) {
            resultado = "Magreza";
        } else if (imc < 24.9) {
            resultado = "Normal";
        } else if (imc < 29.9) {
            resultado = "Sobrepeso";
        } else if (imc < 39.9) {
            resultado = "Obesidade";
        } else {
            resultado = "Obesidade";
        }
        System.out.println("A classificação obtida através do seu IMC é " + resultado);
    }
}
