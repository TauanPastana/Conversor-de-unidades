package classes;

// import java.util.InputMismatchException;

public class Temperatura extends Unidade {

    public Temperatura(float temp_Atual){

    super(temp_Atual);
    
    }

    public static Temperatura Setvalor(java.util.Scanner scanner){
        float valor = Temperatura.lerValor(scanner, "Digite o valor a ser convertido: ", true);
        return new Temperatura(valor);
    }


    public void Celsius_to_Fahrenheit() {
        float atual = getTempAtual();
        float convertido = (atual * 9 / 5) + 32;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f°C equivalem a %.2f°F.%n", getTempAtual(), getTempConvertida());
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Fahrenheit_to_Celsius() {
        float atual = getTempAtual();
        float convertido = (atual - 32) * 5 / 9;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f°F equivalem a %.2f°C.%n", getTempAtual(), getTempConvertida());
        System.out.println("Conversão realizada: Fahrenheit para Celsius.");
    }

    public void Celsius_to_Kelvin() {
        float atual = getTempAtual();
        float convertido = atual + 273.15f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f°C equivalem a %.2fK.%n", getTempAtual(), getTempConvertida());
        System.out.println("Conversão realizada: Celsius para Kelvin.");
    }

    public void Kelvin_to_Celsius() {
        float atual = getTempAtual();
        float convertido = atual - 273.15f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2fK equivalem a %.2f°C.%n", getTempAtual(), getTempConvertida());
        System.out.println("Conversão realizada: Kelvin para Celsius.");
    }

    public void Fahrenheit_to_Kelvin() {
        float atual = getTempAtual();
        float convertido = (atual - 32) * 5 / 9 + 273.15f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f°F equivalem a %.2fK.%n", getTempAtual(), getTempConvertida());
        System.out.println("Conversão realizada: Fahrenheit para Kelvin.");
    }

    public void Kelvin_to_Fahrenheit() {
        float atual = getTempAtual();
        float convertido = (atual - 273.15f) * 9 / 5 + 32;
        setTemp_Convertida(convertido);
        System.out.printf("%.2fK = %.2f°F%n", getTempAtual(), getTempConvertida());
        System.out.println("Conversão realizada: Kelvin para Fahrenheit.");
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

        
        Temperatura temp;

        String input = scanner.nextLine();
        // Temperatura.clear_terminal();
        switch (input) {
            case "1":
            temp = Temperatura.Setvalor(scanner);
            temp.Celsius_to_Fahrenheit();
            break;
            case "2":
            temp = Temperatura.Setvalor(scanner);
            temp.Fahrenheit_to_Celsius();
            break;
            case "3":
            temp = Temperatura.Setvalor(scanner);
            temp.Celsius_to_Kelvin();
            break;
            case "4":
            temp = Temperatura.Setvalor(scanner);
            temp.Kelvin_to_Celsius();
            break;
            case "5":
            temp = Temperatura.Setvalor(scanner);
            temp.Fahrenheit_to_Kelvin();
            break;
            case "6":
            temp = Temperatura.Setvalor(scanner);
            temp.Kelvin_to_Fahrenheit();
            break;
            default:
            System.out.println("Opção inválida.");
        }
        }
        }
    





    
    