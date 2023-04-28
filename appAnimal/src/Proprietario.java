public class Proprietario {
    private String nome ;
    private int telefone;


public Proprietario(){}
    public Proprietario(String nome, int telefone) {

        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String imprimir(){
        return "Nome: "+nome+
                "\n Telefone: "+ telefone;
    }
}
