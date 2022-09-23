public class M01S02Ex03EstruturaRepeticao {

    public static void main (String[] args){
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        int saldo =0;
        System.out.println("a) Imprima cada elemento do array na ordem:");
        for ( int i=0; i < extrato.length ; i++) {
            System.out.println(extrato[i]);
            saldo=saldo+extrato[i];
        }

        System.out.println("b) Imprima os elementos do array de trás para frente:");
        for ( int j=extrato.length-1; j >= 0 ; j--) {
            System.out.println(extrato[j]);
        }
        System.out.println("c) Imprima o saldo no console:");
        System.out.println("O saldo de sua conta é "+saldo);
        System.out.println("d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo':");
        String resultado = saldo >=0 ? "positivo":"negativo";
        System.out.println("Seu saldo é "+resultado);

    }

}
