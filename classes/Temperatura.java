package classes;

public class Temperatura extends Unidade {

    // Super construtor da classe Unidade
    public Temperatura(float temp_Atual){
    super(temp_Atual);
    
    }
    // Quando chamado, ocorre um processo para inserir um valor float e após isso retorna o contrutor com o valor para criar o objeto "temp"
    public static Temperatura Setvalor(java.util.Scanner scanner){
        Temperatura.clear_terminal();
        float valor = Temperatura.lerValor(scanner, "Digite o valor a ser convertido: \n", true);
        return new Temperatura(valor);
    }


    public void Celsius_to_Fahrenheit() {
        // Como o atributo "tem_Atual" é um atributo privado, é necessário pegar o seu valor com um get
        float atual = getUnidadeAtual();
        float convertido = (atual * 9 / 5) + 32; // Ocorre o cálculo dá conversão e guarda o valor numa variável temporária
        setUnidade_Convertida(convertido); //seta o valor da variável temporária no atributo "Unidade_Convertido"
        System.out.printf("Conversão: %.2f°C equivalem a %.2f°F.%n", getUnidadeAtual(), getUnidadeConvertida());
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Fahrenheit_to_Celsius() {
        float atual = getUnidadeAtual();
        float convertido = (atual - 32) * 5 / 9;
        setUnidade_Convertida(convertido);
        System.out.printf("Conversão: %.2f°F equivalem a %.2f°C.%n", getUnidadeAtual(), getUnidadeConvertida());
        System.out.println("Conversão realizada: Fahrenheit para Celsius.");
    }

    public void Celsius_to_Kelvin() {
        float atual = getUnidadeAtual();
        float convertido = atual + 273.15f;
        setUnidade_Convertida(convertido);
        System.out.printf("Conversão: %.2f°C equivalem a %.2fK.%n", getUnidadeAtual(), getUnidadeConvertida());
        System.out.println("Conversão realizada: Celsius para Kelvin.");
    }

    public void Kelvin_to_Celsius() {
        float atual = getUnidadeAtual();
        float convertido = atual - 273.15f;
        setUnidade_Convertida(convertido);
        System.out.printf("Conversão: %.2fK equivalem a %.2f°C.%n", getUnidadeAtual(), getUnidadeConvertida());
        System.out.println("Conversão realizada: Kelvin para Celsius.");
    }

    public void Fahrenheit_to_Kelvin() {
        float atual = getUnidadeAtual();
        float convertido = (atual - 32) * 5 / 9 + 273.15f;
        setUnidade_Convertida(convertido);
        System.out.printf("Conversão: %.2f°F equivalem a %.2fK.%n", getUnidadeAtual(), getUnidadeConvertida());
        System.out.println("Conversão realizada: Fahrenheit para Kelvin.");
    }

    public void Kelvin_to_Fahrenheit() {
        float atual = getUnidadeAtual();
        float convertido = (atual - 273.15f) * 9 / 5 + 32;
        setUnidade_Convertida(convertido);
        System.out.printf("%.2fK = %.2f°F%n", getUnidadeAtual(), getUnidadeConvertida());
        System.out.println("Conversão realizada: Kelvin para Fahrenheit.");
    }
    
    public static void Menu(java.util.Scanner scanner){
        Temperatura.clear_terminal();
        System.out.println("\n=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("Selecione o tipo de conversão:");
        System.out.println("--------------------------------");
        System.out.println("1. Celsius - Fahrenheit");
        System.out.println("2. Fahrenheit - Celsius");
        System.out.println("3. Celsius - Kelvin");
        System.out.println("4. Kelvin - Celsius");
        System.out.println("5. Fahrenheit - Kelvin");
        System.out.println("6. Kelvin - Fahrenheit");
        System.out.println("--------------------------------");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("\nDigite a opção desejada: ");
 
        // Instância o objeto temp
        Temperatura temp;

        String input = scanner.nextLine();
        // Menu das funções de temperaturas
        switch (input) {
            case "1":
            // o objeto "temp" da classe Temperatura, vai receber como retorno a invocação de um construtor com um determinado valor para sua criação
            temp = Temperatura.Setvalor(scanner);
            // Após o objeto criado, invocamos o método para converter o atributo "tem_Atual" do objeto "temp" de Celsius para Fahrenheit
            temp.Celsius_to_Fahrenheit();
            // Usa o break para voltar para o menu Principal
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
            case "0":
            break;
            default:
            System.out.println("Opção inválida.");
        }
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
        }
        }
    





    
    