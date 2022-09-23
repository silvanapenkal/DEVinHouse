import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M01S02Ex06Listas {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);

        List<Integer> triploLista = new ArrayList<>(4);

        for (int i=0;i<lista.size();i++){
            triploLista.add(lista.get(i)*3);
        }

        System.out.println("Sua nova lista é "+triploLista);

    }
}
