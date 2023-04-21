public class ParImpar {
 private int numero;
    public  ParImpar(int numero){
        this.numero=numero;

    }

 public boolean par(){
     if(numero%2==0){
         return true;
     }else{
         return false;
     }
 }
    public int getNumero(){

     return numero;
    }
    public String imprimir(){

        return "Numero: "+numero;
    }
}

