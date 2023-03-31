// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String fruta[]={"carambola", "maça","pera","uva","laranja","goiaba","ameixa","mamão","melancia"
        ,"framboesa","pitanga","açaí","graviola","banana","maracuja"};
        pesquisar(fruta);
    }
    static void pesquisar(String []f){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o nome de alguma fruta: ");
        String dado = entrada.next();
        boolean x = false;
        for(int i = 0;i< f.length;i++ ) {
            if (dado == f[i]) {
                 x = true;       // TERMINA EM CASA, TA no BLACKBOARD
                System.out.println(x);
            }
        }
    }

}