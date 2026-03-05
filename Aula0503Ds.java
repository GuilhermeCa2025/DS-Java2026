
package aula0503.ds;

 import java.util.Scanner;

public class Aula0503Ds {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in); 
        
        System.out.println ("Informe o seu nome: ");
         String nome = sc.nextLine();
         
        System.out.println("informe sua escola");
         String escola = sc.nextLine();
         
        double nt = 0;
        double media = 0;
        
          for(int i = 0; i<6; i++){
          System.out.println("Informe suas notas:");
           
           while (true){
               
               nt = sc.nextInt();
           if (nt <= 10 && nt >= 0){
               break;
          }
           }
           media = media + nt;
          }
           
          
       
           System.out.println("Sua média é:" + media/6 );  }
}
