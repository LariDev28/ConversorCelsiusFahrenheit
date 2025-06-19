/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorcef;
import java.util.Scanner;

public class ConversorCeF {

   
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double tempCel, tempF, conversor, resto;
       int opcao;
       
       System.out.println("Olá, para converter de Celsius para Fahreheit, digite 1; "
               + "de Fahreheit para Celsius digite 2:");
       opcao = teclado.nextInt();
       
       if(opcao == 1){
          System.out.println("Digite o valor em Celsius que deseja converter:");
          tempCel = teclado.nextDouble();
          conversor = tempCel * 1.8 + 32;
          System.out.println("O resultado é; "+conversor+"Fº");
         
       }else if(opcao == 2){
           System.out.println("Digite o valor em Fahreheit que deseja converter:");
           tempF = teclado.nextDouble();
           conversor = tempF - 32;
           resto = conversor/1.8;
           System.out.println("O resultado é: "+conversor+"Cº");
       }else{
           System.out.println("Opção invalida! Tente novamente.");
       }
       
       
        
        
    }
    
}
