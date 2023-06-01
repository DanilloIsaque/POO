public class Gerente extends Funcionario{

private int numeroFuncionarios;

    public Gerente(String nome,double salario, int numeroFuncionarios){  //tem q seguir a ordem da classe pai
       super(nome, salario);
       this.numeroFuncionarios=numeroFuncionarios;
    }

    public Gerente(){//posso criar classe sem passar os parametros
        super();//forma de chamar os elementos da classe pai
    }

    @Override //vai sobrescrever os dados
    public double aumentarSalario(double percentual){
    return super.aumentarSalario(percentual+20);
    }

    @Override
    public String imprimir(){
        return super.imprimir()+",numero funcionarios: "+ numeroFuncionarios;
    }

}
