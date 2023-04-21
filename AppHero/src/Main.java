// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Hero listaHero[]=new Hero[5];
        Hero hero;//referencia para classe Hero
        int i;
        String nome,poder;

        for(i=0;i<listaHero.length;i++){
            System.out.println("==> Dados do Hero" +(i+1)+":");
            System.out.println("Heroi?");
            nome=entrada.nextLine();
            System.out.println("Poder?");
            poder= entrada.nextLine();
            //chama o construtor com parametros
            hero=new Hero(nome,poder);
            listaHero[i]=hero; // mesma coisa de pegar a posicao do vetor e instanciar o objeto
            //listaHero[i]=new Hero(nome,poder);
        }
        System.out.println("===HEROIS CADASTRADOS===");
        for(Hero h :listaHero){
            System.out.println(h.imprimir() +"\n");
        }
    }
}