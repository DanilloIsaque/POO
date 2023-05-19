public class Ipva {
    private double valorBase;
    private int quantidadeCavalos;

    Ipva(){}

    public Ipva(double valorBase,int quantidadeCavalos){
        this.valorBase= valorBase;
        this.quantidadeCavalos= quantidadeCavalos;
    }
    public double calcularIpva(){
        return getValorBase() * getQuantidadeCavalos();
    }
    public String imprimir(){
        return "\nvalor base: "+ getValorBase() +
                "\nquantidade de cavalos: "+ getQuantidadeCavalos() +
                "\nipva: "+ calcularIpva();
    }

    public double getValorBase() {
        return valorBase;
    }

    public int getQuantidadeCavalos() {
        return quantidadeCavalos;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void setQuantidadeCavalos(int quantidadeCavalos) {
        this.quantidadeCavalos = quantidadeCavalos;
    }
}
