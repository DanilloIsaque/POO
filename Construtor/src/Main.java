// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria",25);
        maria.sexo='f';
        System.out.println(maria.imprimir());

        Pessoa joao = new Pessoa("Joao" , 5 , 'm');
        System.out.println(joao.imprimir());

        Pessoa objPessoa = new Pessoa();
    }
}