import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M01S02Ex10EstruturaRepeticao {

    public static void main(String[] args) {

        List<String > palavra = Arrays.asList("A","M","A");
        List<String> contrario = new ArrayList<>(palavra.size());


        for (int i=palavra.size()-1; i>=0;i--) {
            contrario.add(palavra.get(i));
        }
        System.out.println("o contrário é "+contrario);
        if (contrario.equals(palavra)){
            System.out.println("'"+palavra+"' é um palíndromo.");
        } else {
            System.out.println("'"+palavra+"' não é um palíndromo.");
        }


    }
}
