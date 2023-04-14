public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public Time(int hora, int minuto, int segundo){
        if(hora>=0 && hora<24){
            this.hora= hora;
        }
        if(minuto>=0 && minuto<60){
            this.minuto= minuto;
        }
        if(segundo>=0 && segundo<60){
            this.segundo= segundo;
        }
    }
    public int getHora(){
        return this.hora; //apenas retorna o valor da hora
    }
    public int getMinuto(){
        return this.minuto;
    }
    public int getSegundo(){
        return this.segundo;
    }
    public void setHora(int hora){
        if(hora>=0 && hora<24){
            this.hora= hora;
        }//altera a hora e n precisa retornar
    }
    public void setMinuto(int minuto){
        if(minuto>=0 && minuto<60){
            this.minuto= minuto;
        }
    }
    public void setSegundo(int segundo){
        if(segundo>=0 && segundo<60){
            this.segundo= segundo;
        }
    }
    public String imprimir(){
        return hora +":"+minuto+":"+segundo;
    }

    public String visualizarHoraUniversal(){
        return this.imprimir() +"horas";
    }

    public String visualizarHoraAmPm(){

        if(this.hora>12 || this.hora==12){
            return this.hora-12 + "PM";
        } else if (this.hora<12 || this.hora==00) {
            return this.hora +"AM";
        }else {
            return null; //se n entrar em nenhum dos ifs
        }
    }

}
