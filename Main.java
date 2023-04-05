import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá!Com Esse programa é possível saber a localização " +
                "da queda de um ou mais meteoritos em um área retangular");


        int contT = 1;
        int acabar = 0;

        while (acabar != 1) {

            int x1 = -1;
            int y1 = -1;
            int x2 = -1;
            int y2 = -1;

            System.out.println("Para comecar, digite uma coordenada de 0 até 10000 para medirmos " +
                    "uma das partes da área atingida");

            if (x1 == -1) {
                while (x1 > 10000 || x1 < 0) { //esse while serve pra enquanto o usuario n enciar um valor dentro das condições n continuará
                    x1 = entrada.nextInt();
                }
            }
            System.out.println("Agora digite outra:");

            if (y1 == -1) {
                while (y1 > 10000 || y1 < 0) {
                    y1 = entrada.nextInt();
                }
            }
            System.out.println("Agora digite mais outra coordenada de 0 até 10000 para medirmos a outra parte da " +
                    "área atingida");

            if (x2 == -1) {
                while (x2 > 10000 || x2 < 0 || x2 < x1) {
                    System.out.println("Não pode ser um numero maior que o primeiro digitado, hein");
                    x2 = entrada.nextInt();
                }
            }
            System.out.println("Agora digite outra:");
            if (y2 == -1) {
                while (y2 > 10000 || y2 < 0 || y2 > y1) {
                    System.out.println("Não pode ser um numero maior que o digitado agora pouco,hein");
                    y2 = entrada.nextInt();
                }
            }

            if (x1 == y1 && x2 == y2 && x1 == 0) {
                break; //aqui ele termina o programa
            }

            System.out.println("Agora digite a quantidade de meteoritos:");
            int N = -1;
            while (N < 0 || N > 10000) {
                N = entrada.nextInt();
            }

            // aqui, ele vai fazer os testes
            int quedas = 0;
            for (int i = 1; i <= N; i++) {

                int X = -1;
                System.out.println("digite a primeira coordenada do meteorito:");
                while (X > 10000 || X < 0) {
                    System.out.println("Lembrando que a coordenada não pode ser maior que 10000 ou negativo , hein");
                    X = entrada.nextInt();
                }
                System.out.println("digite a outra: ");
                int Y = -1;
                while (Y > 10000 || Y < 0) {
                    System.out.println("Lembrando que a coordenada não pode ser maior que 10000 ou negativo,hein");
                    Y = entrada.nextInt();
                }
                if ((X >= x1 || X >= x2) && (Y >= y1 || Y >= y2)) {
                    quedas++;
                }


            }
            System.out.println("Teste " + contT++);
            System.out.println(quedas + "\n");
        }



    }
}