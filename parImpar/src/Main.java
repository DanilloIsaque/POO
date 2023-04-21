// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ParImpar lista[]  = new ParImpar[10];
        ParImpar parImpar;
        double porcentagem =0;
        double valor;
        int i;
        int n;

        for(i=0;i<lista.length;i++){
            System.out.println("valor " +(i+1));
            System.out.println("Qual o valor?");
           n = entrada.nextInt();
            if(n%2!=0){
               porcentagem++;
            }
          parImpar = new ParImpar(n);
          lista[i]=parImpar;

        }
        porcentagem= porcentagem*10;
        System.out.println("a porcentagem de numeros impares entre os 10 digitados é : " + porcentagem +"%");
        for(ParImpar p : lista){
            p.par();
            System.out.println(p.par() + "\n");
        }


    }
}