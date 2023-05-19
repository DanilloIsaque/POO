import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o nome");
        String nome = entrada.nextLine();//nextline le até a quebra de linha
        System.out.println("digite o salario");
        double salario = entrada.nextDouble();
        System.out.println("digite o numero de funcionarios");
        int numeroFuncionarios = entrada.nextInt();

        Gerente jose = new Gerente(nome,salario,numeroFuncionarios);
        jose.aumentarSalario(10);
        System.out.println(jose.imprimir());

    }
}
