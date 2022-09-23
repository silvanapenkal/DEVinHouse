import java.util.Arrays;
import java.util.List;

public class M01S02Ex08Listas {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        for (int i=0; i< numeros.size();i++){
            if (numeros.get(i)>50){
                System.out.println(numeros.get(i)+" é o primeiro número maior do que 50 nesta lista.");
                break;
            }
        }

    }

}
