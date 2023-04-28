public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;

    public Pessoa(){
        this.end = new Endereco();
    }

    public void setNome(String nome){
         this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }



    public String imprimir(){
        return "Nome: "+nome+
                "\nIdade: "+idade +
                "\nSexo: "+sexo+
                "\nEndereco"+ end.imprimir();
    }

}
