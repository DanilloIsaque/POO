import java.util.ArrayList;

public class ListaDeHerois {
    //atributo- static define uma única lista
    //compartilhada na aplicação
    private static ArrayList<Hero> listaHero =
                                    new ArrayList<>();

    //get da lista de herois


    public static ArrayList<Hero> getListaHero() {
        return listaHero;
    }



    //metodo para adicionar Heroi no fim da lista

    static void adicionar(Hero h){
        listaHero.add(h);
    }

    //Metodo para adicionar Heroi na posição específica
    static void adicionar(Hero h , int index){
        listaHero.add(index,h);
    }

    //método para listar herois cadastrados na lista

    static String listar() {
        String saida = "";
        for (Hero h : listaHero) {
            saida += h.imprimir() + "\n";

        }
        return saida;
    }
    //metodo para buscar elemento no vetor -indexOf
    static int buscarElemento(Hero hero){
        return listaHero.indexOf(hero);
    }

    //método para buscar objeto pelo "poder"
    static Hero buscarElemento(String poder){
        for(Hero h :listaHero){
            if(h.getPoder().equalsIgnoreCase(poder));
            return h;
        }
        return  null;
    }
    //Método para remover heroi pelo indice
    static void remover(int index){
        listaHero.remove(index);
    }
}
