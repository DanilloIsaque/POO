
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome , double salario){
        this.nome=nome;
        this.salario=salario;
    }
    public Funcionario(){}


    public double aumentarSalario(double percentual){
        return this.salario+=salario* percentual/100;
    }
    public String imprimir(){
        return "\nnome: "+ nome+
                "\nsalario: "+ String.format("%.2f",salario);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }
}
