public class IpvaCaminhao extends Ipva {

    protected int quantidadeEixos;

    public IpvaCaminhao(double valorBase , int quantidadeCavalos, int quantidadeEixos){
        super(valorBase,quantidadeCavalos);
        this.quantidadeEixos=quantidadeEixos;
    }

    public IpvaCaminhao(){
        super();
    }

    @Override
    public double calcularIpva(){
        return  super.calcularIpva() * quantidadeEixos;
    }

    @Override
    public String imprimir(){
        return super.imprimir()+"\nquantidade de eixos: "+quantidadeEixos;
    }
}

