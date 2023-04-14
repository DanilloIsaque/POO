// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Time horaEvento = new Time(5,30,00);
        System.out.println("Hora do evento: "+ horaEvento.imprimir());
        //horaEvento.hora com o private n consigo alterar variavel por fora, apenas pela classe
        System.out.println(horaEvento.getHora());
        System.out.println(horaEvento.getMinuto());
        System.out.println(horaEvento.getSegundo());
        horaEvento.setHora(13);
        horaEvento.setMinuto(30);
        horaEvento.setSegundo(59);
        System.out.println(horaEvento.imprimir());
        System.out.println(horaEvento.visualizarHoraUniversal());
        System.out.println(horaEvento.visualizarHoraAmPm());
    }
}