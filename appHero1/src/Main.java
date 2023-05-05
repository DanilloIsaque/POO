// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declara um arraylist dp tipo Hero
        ArrayList<Hero> listaHero = new ArrayList<>();


        //cria 4 objetos do tipo Hero
        Hero hero1 = new Hero("Homem Aranha", "escalar paredes");
        Hero hero2 = new Hero("Hulk", "Força");
        Hero hero3 = new Hero("superman", "Força");
        Hero hero4 = new Hero("wolverine", "arranhar");

        //grava na ArrayList
        ListaDeHerois.adicionar(hero1);
        ListaDeHerois.adicionar(hero2);
        ListaDeHerois.adicionar(hero3);
        ListaDeHerois.adicionar(hero4);


        System.out.println("=======Herois cadastrados====");
        System.out.println(ListaDeHerois.listar());

        System.out.println("======INSERE UM HEROI NA POSIÇÃO ESPECIFICA(posicao1)=====");
        Hero hero5= new Hero("batman" ,"voar");
        ListaDeHerois.adicionar(hero5,1);
       // adicionarHeroi1(listaHero,hero5,1);
        System.out.println("apos o novo cadadstro");
        System.out.println(ListaDeHerois.listar());

        System.out.println("====USO DO get(int index)====");
        System.out.println("Heroi Cadastrado na posição: " + ListaDeHerois.getListaHero(1);//+(1)+""+listaHero.get(1).Lista()); retorna o q esta nesse indice

        System.out.println("====TOTAL DE HEROIS CADASTRADOS====");
        System.out.println(listaHero.size());//tamanho do array

        System.out.println("===VERIFICA SE O ARRAY ESTÁ VAZIO===");
        if(listaHero.isEmpty()){
            System.out.println("Array Vazio");
        }else {
            System.out.println("Está ocupado");
        }

        System.out.println("====Uso DO indexOf(Object o)====");
        System.out.println("está no indice: "+ListaDeHerois.buscarElemento(hero5));//buscarElemento(listaHero,hero5));retornou o indice 1 , pois é aonde alterou no segundo add

        System.out.println("===BUSCA OBJETO PELO PODER===");
        Hero h =ListaDeHerois.buscarElemento("Força"); //buscarElemento(listaHero,"Força");retorna o primeiro array com o valor q está no poder
        System.out.println(h.imprimir());

        System.out.println(("===REMOVER OBJETO PELO INDEX(posicao0)===="));
        ListaDeHerois.remover(0);
        // removerHeroi(listaHero,0);
        System.out.println(ListaDeHerois.listar());
    }
/*
    static void adicionarHeroi(ArrayList<Hero> listaHero, Hero hero){

        listaHero.add(hero);
    }
    static void adicionarHeroi1(ArrayList<Hero> listaHero, Hero hero,int index){
    //grava no indice especifico
        listaHero.add(index,hero); //ele altera o que esta nessa posicao
    }
    static String listarHerois(ArrayList<Hero> listaHero){
        String saida="";

        for (Hero h :listaHero){
            saida+=h.imprimir()+ "\n";
        }
        return saida;
    }
    static int buscarElemento(ArrayList<Hero> listaHero, Hero hero){
        return listaHero.indexOf((hero));//retorna o objeto do vetor
    }

    static Hero buscarElemento(ArrayList<Hero> listaHero, String poder){
        for(Hero h : listaHero){
            if(h.getPoder().equalsIgnoreCase(poder)){
                return h;
            }
        }
        return null;
    }
    static void removerHeroi(ArrayList<Hero> listaHero, int index){
        listaHero.remove(index);
    }
    */

}