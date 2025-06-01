package classes;

import java.util.Scanner;

public class Medida extends Unidade {

    public Medida(float medida_Atual){
        // boolean cond = (medida_Atual<0)?
        super(medida_Atual);
    }

    public static Medida setValor(Scanner scanner){
        float valor = Medida.lerValor(scanner, "Adicione o valor a ser convertido: ", false);
        return new Medida(valor);

    }

    public void Metros_para_Centimetros() {
        float atual = getTempAtual();
        float convertido = atual * 100;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f centímetros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Metros_para_Milimetros() {
        float atual = getTempAtual();
        float convertido = atual * 1000;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f milímetros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Metros_para_Polegadas() {
        float atual = getTempAtual();
        float convertido = atual * 39.3701f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f polegadas.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Metros_para_Pes() {
        float atual = getTempAtual();
        float convertido = atual * 3.28084f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f pés.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Centimetros_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 100;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f centímetros equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Milimetros_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 1000;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f milímetros equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Polegadas_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 39.3701f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f polegadas equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Pes_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 3.28084f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f pés equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }
    

    public static void Menu(Scanner scanner) {
        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1. Metros para Centímetros");
        System.out.println("2. Metros para Milímetros");
        System.out.println("3. Metros para Polegadas");
        System.out.println("4. Metros para Pés");
        System.out.println("5. Centímetros para Metros");
        System.out.println("6. Milímetros para Metros");
        System.out.println("7. Polegadas para Metros");
        System.out.println("8. Pés para Metros");
        System.out.print("Opção: ");

        String input = scanner.nextLine();
        Medida medida;

        switch (input) {
            case "1":
                medida = Medida.setValor(scanner);
                medida.Metros_para_Centimetros();
                break;
            case "2":
                medida = Medida.setValor(scanner);
                medida.Metros_para_Milimetros();
                break;
            case "3":
                medida = Medida.setValor(scanner);
                medida.Metros_para_Polegadas();
                break;
             case "4":
                medida = Medida.setValor(scanner);
                medida.Metros_para_Pes();
                break;
            case "5":
                medida = Medida.setValor(scanner);
                medida.Centimetros_para_Metros();
                break;
            case "6":
                medida = Medida.setValor(scanner);
                medida.Milimetros_para_Metros();
                break;
            case "7":
                medida = Medida.setValor(scanner);
                medida.Polegadas_para_Metros();
                break;
            case "8":
                medida = Medida.setValor(scanner);
                medida.Pes_para_Metros();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    



    
}
