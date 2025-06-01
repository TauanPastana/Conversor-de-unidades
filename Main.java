
import java.util.Scanner;

import classes.Temperatura;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        boolean cond = true;
        
        System.out.println("Bem vindo ao sistema de Conversor de unidades");
        while (cond) {
            System.out.println("Digite 1 se deseja converter temperaturas");
            String opc = scanner.nextLine();

            switch (opc) {
                case "1":
                    Temperatura.Menu(scanner);
                    break;
                case "2":
                    // Adicione lógica para a opção 2 aqui
                    break;
                case "3":
                    // Adicione lógica para a opção 3 aqui
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        


        
    }
    
}
