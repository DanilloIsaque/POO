import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o valor da base");
        double valorBase = entrada.nextDouble();//nextline le até a quebra de linha
        System.out.println("digite o valor dos cavalos");
        int quantidadeCavalos = entrada.nextInt();

        Ipva ipva = new Ipva(valorBase,quantidadeCavalos);



        Scanner entrada2 = new Scanner(System.in);
        System.out.println("digite o valor da base");
        double valorBase2 = entrada2.nextDouble();//nextline le até a quebra de linha
        System.out.println("digite o valor dos cavalos");
        int quantidadeCavalos2 = entrada2.nextInt();
        System.out.println("digite o valor dos eixos");
        int quantidadeEixos2 = entrada2.nextInt();

        IpvaCaminhao ipva2 = new IpvaCaminhao(valorBase2,quantidadeCavalos2,quantidadeEixos2);

        System.out.println(ipva.imprimir());
        System.out.println(ipva2.imprimir());


    }
}