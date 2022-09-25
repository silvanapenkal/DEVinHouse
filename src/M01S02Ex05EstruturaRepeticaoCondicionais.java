public class M01S02Ex05EstruturaRepeticaoCondicionais {

    public static void main(String[] args) {

        Integer [][] numeros = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2,-2,-2,-2},
                {20,10, 30}
        };

        Integer maior;
        Integer menor;
        Integer entrada;

        for (int j=0; j< numeros.length;j++){
            entrada = j+1;
            System.out.println("Entrada "+entrada);
            if (numeros[j]==null){
                System.out.println("Não é possível calcular.");
                continue;
            }
            maior= numeros[j][0];
            menor= numeros[j][0];
            for (int i=0; i< numeros[j].length;i++){

                     if (menor>numeros[j][i]){
                        menor= numeros[j][i];
                    }
                    if (maior<numeros[j][i]){
                        maior= numeros[j][i];
                    }
            }
            System.out.println("O maior número é: "+maior);
            System.out.println("O menor número é: "+menor);

        }


    }
}
