public class Animal {
    private String nome;
    private String raca;
    private String cor;

    private int ano;
    private Proprietario prop;

    public Animal(String nome, String raca, String cor,int ano, Proprietario prop) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.ano = ano;
        this.prop = prop;
    }
    public Animal(){
        this.prop = new Proprietario();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Proprietario getProprietario() {
        return prop;
    }

    public void setProprietario(Proprietario prop) {
        this.prop = prop;
    }

    public String imprimir(){
        return "Nome do animal: "+nome+
                "\nRaca do animal: "+raca+
                "\n Cor do animal: "+cor+
                "\n ano: "+ano+
                "\n Proprietario: "+ prop.imprimir();
    }

}
