// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        int i, somatorio = 0;

        for(i=0; i<vetor.length;i++) {
            somatorio += vetor[i];
        }
        System.out.println(somatorio);

        String cidade[]={"São Paulo","Rio de Janeiro","Bahia","Salvador","Rio grande do sul","Recife","Pernambuco"};
        String imprimir;

        for (int n =0; n<cidade.length; n++)
        {
            imprimir = cidade[n];
            System.out.println(imprimir);
        }
    }
}