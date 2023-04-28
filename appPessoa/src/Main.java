import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pessoa objPessoa= new Pessoa();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString=new Scanner(System.in);
        System.out.println("digite o seu nome");
        String nome = entradaString.nextLine();
        objPessoa.setNome(nome);

        System.out.println("digite a sua idade");
        int idade = entrada.nextInt();
        objPessoa.setIdade(idade);

        System.out.println("digite o seu sexo");
        char sexo = entrada.next().charAt(0);
        objPessoa.setSexo(sexo);

        System.out.println(objPessoa.imprimir());

    }
}