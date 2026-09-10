


import java.util.ArrayList;
import java.util.Scanner;


public class Lista_objeto {

   
   
        public static void main(String[] args) {
            manipulaluno ma = new manipulaluno();
        Scanner entrada = new Scanner(System.in);
        

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - percorrer");
            System.out.println("3 - remover aluno");
            System.out.println("4 - media");
            System.out.println("5 – media geral");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    
                    ma.inserir();
                    
                    break;

                case 2:
                    ma.percorrer();
                    break;

                case 3:
                    ma.removeraluno();
                    break;

                case 4:
                    ma.media();
                    break;

                case 5:
                    // Ordenar números
                    break;              
                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        entrada.close();
    }
}

    

