import java.util.Arrays;
import java.util.List;

public class M01S02Ex07Listas {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        System.out.println("a) Usando o for");
        for (int i= 0; i< nomes.size();i++){
            System.out.println("Nome na posição "+i+": "+nomes.get(i));
        }
        System.out.println("b) Usando o for-each");
        for (String nome: nomes) {
            System.out.println("Nome: "+nome);
        }
        System.out.println("c) Usando o while");
        int totalNomes = nomes.size();
        int posicaoAtual = 0;
        while (posicaoAtual<totalNomes){
            System.out.println("Nome "+posicaoAtual+": "+nomes.get(posicaoAtual));
            posicaoAtual=posicaoAtual+1;
        }
    }
}
