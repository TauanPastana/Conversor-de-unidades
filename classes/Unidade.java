package classes;


public abstract class Unidade {
    private float temp_Atual;
    private float temp_Convertida = 0;

    public Unidade(float temp_Atual){
        this.temp_Atual = temp_Atual;
        
        
    }



    public void setTemp_Convertida(float temp_Convertida) {
        this.temp_Convertida = temp_Convertida;
    }



    public static void clear_terminal(){
        

    }





    public float getTempAtual() {
    return temp_Atual;
}

    public float getTempConvertida() {
    return temp_Convertida;
}
}

