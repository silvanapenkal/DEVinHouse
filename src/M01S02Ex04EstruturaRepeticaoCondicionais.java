public class M01S02Ex04EstruturaRepeticaoCondicionais {

    public static void main(String[] args) {
        int sorteados[][] = {
                { 1, 44,  6,  2, 45, 60},
                {10, 21, 55, 25, 34, 44},
                { 8, 18, 28, 29, 55, 59},
                {60, 25, 11, 34,  6,  9},
                {55, 43, 25, 12,  7, 11}
        };

        int contagem =0;

        for (int i=0;i<sorteados.length ;i++){
            for (int j=0;j<6 ;j++){
                if (sorteados[i][j]==25){
                    contagem=contagem+1;
                }
            }
        }

        System.out.println("Seu número da sorte apareceu "+contagem+" vezes.");

    }




}
