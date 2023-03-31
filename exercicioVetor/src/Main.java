// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
            int vetor[] = new int[9];
            lerVetor(vetor);
            somarNumeros(vetor);
            calcularMedia(vetor);

    }
    static void lerVetor(int []a){
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<a.length;i++) {
            System.out.println("digite 10 numeros: ");
            int valor =entrada.nextInt();
            a[i]= valor;
        }
    }
    static void somarNumeros(int []va) {
        int soma=0; //criar variavel fora do for para utiliza=la fora dele dps
        for (int i = 0; i < va.length;i++){
            soma+=va[i];


        }
        System.out.println(soma);
    }
    static void calcularMedia(int []ar){
        int total=0;
        for (int i = 0; i < ar.length;i++){
            total+=ar[i];
        }
        total= total/10;
        System.out.println(total);
    }
}