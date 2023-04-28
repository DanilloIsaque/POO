import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GerenciarAnimal gerenciarAnimal;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        System.out.println("Digite o nome ");
        String nome = entradaString.nextLine();

        System.out.println("Digite o telefone");
        int telefone = entrada.nextInt();

        System.out.println("Digite o nome do animal");
        String nomeA = entradaString.nextLine();


        System.out.println("Digite a raca");
        String raca = entradaString.nextLine();

        System.out.println("Digite a cor");
        String cor = entradaString.nextLine();

        System.out.println("Digite o ano");
        int ano = entrada.nextInt();

        Proprietario proprietario = new Proprietario(nome, telefone);
        Animal cachorro = new Animal(nomeA, raca, cor,ano,proprietario);
        System.out.println(cachorro.imprimir());

    }
}