public class LivroDeBiblioteca {
    String nome;
    String autor;
    String editora;
    int paginas;
    boolean estaEmprestado;
    String classificao;
    String genero;

    public String verificar(){
        if(estaEmprestado==true){
            return "indisponivel, no momento";
        }else {
            return "Disponivel";
        }
    }
    public String retorno(){
        return "Biblioteca{"+"nome= "+nome + ", editora= "+editora+",  Emprestimo? "+verificar()+'}';
    }

}
