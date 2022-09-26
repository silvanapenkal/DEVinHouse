public class M01S02Ex10EstruturaRepeticao {

    public static void main(String[] args) {
        String palavra ="AMA";
        String inverso ="";
        for (int i=palavra.length()-1; i>=0;i--){
            inverso=inverso+palavra.charAt(i);
        }
        if (palavra.equals(inverso)){
          System.out.println("'"+palavra+"' é um palíndromo.");
        } else {
           System.out.println("'"+palavra+"' não é um palíndromo.");
        }
    }
}
