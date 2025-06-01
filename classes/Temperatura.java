package classes;

import java.util.InputMismatchException;

public class Temperatura extends Unidade {

    public Temperatura(float temp_Atual){

    super(temp_Atual);
    
    }

    public static Temperatura Setvalor(java.util.Scanner scanner){
        try {
            System.out.print("Adicione o valor atual: ");
            float temp_Atual = scanner.nextFloat();
            return new Temperatura(temp_Atual);
            
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida, digite entre 1 a 6");
            scanner.nextLine();
            return null ;
        }
    }


    public void Celsius_to_Fahrenheit(){
        float atual = getTempAtual();
        float convertido = (atual * 9 / 5) + 32;
        setTemp_Convertida(convertido); 
        System.out.println("A temperatura em Celsius (" + getTempAtual() + "°C) foi convertida para Fahrenheit: " + getTempConvertida() + "°F");

    }

    public void Fahrenheit_to_Celsius(){
        float atual = getTempAtual();
        float convertido = (atual -32) * 5/9;
        setTemp_Convertida(convertido); 
        System.out.println("A temperatura em Fahrenheit (" + getTempAtual() + "°F) foi convertida para Celsius: " + getTempConvertida() + "°C");
    }
    
    public void Celsius_to_Kelvin() {
        float atual = getTempAtual();
        float convertido = atual + 273.15f;
        setTemp_Convertida(convertido);
        System.out.println("A temperatura em Celsius (" + getTempAtual() + "°C) foi convertida para Kelvin: " + getTempConvertida() + "K");
    }

    public void Kelvin_to_Celsius() {
        float atual = getTempAtual();
        float convertido = atual - 273.15f;
        setTemp_Convertida(convertido);
        System.out.println("A temperatura em Kelvin (" + getTempAtual() + "K) foi convertida para Celsius: " + getTempConvertida() + "°C");
    }

    public void Fahrenheit_to_Kelvin() {
        float atual = getTempAtual();
        float convertido = (atual - 32) * 5/9 + 273.15f;
        setTemp_Convertida(convertido);
        System.out.println("A temperatura em Fahrenheit (" + getTempAtual() + "°F) foi convertida para Kelvin: " + getTempConvertida() + "K");
    }

    public void Kelvin_to_Fahrenheit() {
        float atual = getTempAtual();
        float convertido = (atual - 273.15f) * 9/5 + 32;
        setTemp_Convertida(convertido);
        System.out.println("A temperatura em Kelvin (" + getTempAtual() + "K) foi convertida para Fahrenheit: " + getTempConvertida() + "°F");
    }
    public static void Menu(java.util.Scanner scanner){
        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("3. Celsius para Kelvin");
        System.out.println("4. Kelvin para Celsius");
        System.out.println("5. Fahrenheit para Kelvin");
        System.out.println("6. Kelvin para Fahrenheit");
        System.out.print("Opção: ");

        
        Temperatura temp = null;
        
        String input = scanner.nextLine();
        Temperatura.clear_terminal();
        switch (input) {
            case "1":
            temp = Temperatura.Setvalor(scanner);
            if (temp != null) temp.Celsius_to_Fahrenheit();
            break;
            case "2":
            temp = Temperatura.Setvalor(scanner);
            if (temp != null) temp.Fahrenheit_to_Celsius();
            break;
            case "3":
            temp = Temperatura.Setvalor(scanner);
            if (temp != null) temp.Celsius_to_Kelvin();
            break;
            case "4":
            temp = Temperatura.Setvalor(scanner);
            if (temp != null) temp.Kelvin_to_Celsius();
            break;
            case "5":
            temp = Temperatura.Setvalor(scanner);
            if (temp != null) temp.Fahrenheit_to_Kelvin();
            break;
            case "6":
            temp = Temperatura.Setvalor(scanner);
            if (temp != null) temp.Kelvin_to_Fahrenheit();
            break;
            default:
            System.out.println("Opção inválida.");
        }
        }
    }





    
    

