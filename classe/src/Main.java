// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa maria = new Pessoa();

        Pessoa joao;
        joao = new Pessoa();

        //inserir dados
        maria.nome = "Maria";
        maria.idade = 19;
        maria.sexo = 'f';

        joao.nome = "Joao";
        joao.idade=55;
        joao.sexo = 'm';

        //resgata os dados

        System.out.println(maria.imprimir());
        System.out.println(joao.imprimir());

        Lampada led = new Lampada();
        led.tipo ="led";
        led.potencia= 6.5;
        led.cor="amarela";
        led.marca="lexman";

        System.out.println(led.lampada());
        LivroDeBiblioteca biblioteca = new LivroDeBiblioteca();

        biblioteca.nome="Blade Runner 2049";
        biblioteca.editora="Cultura";
        biblioteca.genero ="Sci-fi";
        biblioteca.estaEmprestado=true;
       
        System.out.println(biblioteca.retorno());
    }


}