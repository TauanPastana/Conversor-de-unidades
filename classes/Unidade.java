package classes;


public abstract class Unidade {
    private float Unidade_Atual;
    private float Unidade_Convertida = 0;

    public Unidade(float Unidade_Atual){
        this.Unidade_Atual = Unidade_Atual;
        
        
    }



    
    
    
    public static void clear_terminal() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar o terminal.");
        }
    }
    
    


    protected static float lerValor(java.util.Scanner scanner, String mensagem, boolean cond) {
        while (true) {
            System.out.print(mensagem);
            // O método hasNextFLoat() return um valor True se o que o usuário irá digitar é um valor float ou int
            if (scanner.hasNextFloat()) {
                float valor = scanner.nextFloat();
                scanner.nextLine(); // 
                if (cond) { // Aqui passará apenas para valores da classe Temperatura
                    return valor;
                } else { // Aqui, para as demais classes que não aceitam um valores negativos
                    if (valor > 0) {
                        return valor;
                    } else {
                        System.out.println("\nValor inválido, digite um número positivo.");
                    }
                }
                // caso o valor que o usuário digitou não for um numérico, ele recomeça o loop
            } else {
                System.out.println("Valor inválido, tente novamente.");
                scanner.nextLine(); 
            }
        }
    }
    


    // metodos get e set
    public float getUnidadeAtual() {
        return Unidade_Atual;
    }
    
    public void setUnidade_Convertida(float Unidade_Convertida) {
        this.Unidade_Convertida = Unidade_Convertida;
    }
    public float getUnidadeConvertida() {
    return Unidade_Convertida;
}
}