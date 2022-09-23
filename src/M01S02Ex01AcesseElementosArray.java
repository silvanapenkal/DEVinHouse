
public class M01S02Ex01AcesseElementosArray {

    public static void main(String[] args) {
        int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88};

        // a) Imprima o valor do primeiro elemento;
        System.out.println("Valor do primeiro elemento: "+ arr[0]);

        // b) Imprima o valor do último elemento;
        int tamanhoArray = arr.length;
        int ultimoElemento = tamanhoArray-1;
        System.out.println("Valor do último elemento: " + arr[ultimoElemento]);

        // c) Imprima o valor do terceiro elemento;
        System.out.println("Valor do terceiro elemento: " + arr[2]);

    }

}
