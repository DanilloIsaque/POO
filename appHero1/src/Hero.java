public class Hero {
    private String nome;
    private String poder;
    public  Hero(){}
    public Hero (String nome,String poder){
        this.nome=nome;
        this.poder=poder;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String getPoder(){
        return poder;
    }
    public void setPoder(String poder){
        this.poder = poder;
    }

    public String imprimir(){
        return "Nome: "+nome + "\nPoder: "+ poder;
    }
}