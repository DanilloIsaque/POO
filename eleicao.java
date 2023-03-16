import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int presidente = 0;
    int presidente2 = 0;
    int branco = 0;
    int cont = 0;
    while (cont < 49) {
      System.out.println("digite o numero do seu presidente: ");
      int dig = entrada.nextInt();
      if (dig == 22) {
        System.out.println("voto confirmado!");
        presidente++;

      } else if (dig == 13) {
        System.out.println("voto confirmado!");
        presidente2++;
      } else if (dig == 00) {
        System.out.println("voto confirmado!");
        branco++;
      }
      cont++;
    }
    if (presidente > presidente2) {
      System.out.println("o presidente fulano teve " + presidente + "votos enquanto lulor teve " + presidente2
          + " votos. Também obtivemos "+ branco +" votos brancos . Com isso, bonoro é o presidente");
    } else if (presidente2 > presidente) {
      System.out.println("o presidente ciclano teve " + presidente2 + " votos enquanto lulor teve " + presidente
          + " votos . Também obtivemos "+ branco +" votos brancos .,com isso lulor é o presidente");
    }else{
        System.out.println("Obtivemos mais votos brancos ou empate entre os candidatos, portanto, em breve teremos um segundo turno." + 
        "\nVotos brancos: "+branco+" votos." +
        "\nVotos para fulano: "+presidente+" votos."
        +"\nVotos para ciclano: "+presidente2+" votos.");
    }

  }
}