
import java.util.Scanner;

import classes.Massa;
import classes.Medida;
import classes.Temperatura;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        boolean cond = true;
        System.out.println("Bem vindo ao sistema de Conversor de unidades");
        
        while (cond) {
            System.out.println("\nDigite 1 se deseja converter temperaturas");
            System.out.println("Digite 2 se deseja converter medidas");
            System.out.println("Digite 3 se deseja converter massa");
            String opc = scanner.nextLine();
             
            switch (opc) {
                case "1":
                    Temperatura.Menu(scanner);
                    break;
                    
                case "2":
                    Medida.Menu(scanner);
                    break;
                case "3":
                    Massa.Menu(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        


        
    }
    
}
