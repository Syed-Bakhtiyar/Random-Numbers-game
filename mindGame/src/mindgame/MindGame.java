/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindgame;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author bakhtiyar
 */
public class MindGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
   
      
       do{
       System.out.println("\npress 1. to First step\npress 2. to second step\npress 3. to third step\npress 4. fourth step\npress 5. fifth step\npress 6. I tell you what number is in your mind got it? \npress 7. Exit\n\n");
       int x;
        
       int rand=funct();
       System.out.print("Enter Your Choice: ");
       Scanner input = new Scanner(System.in);
       x = input.nextInt();
       switch(x){
       
           
           case 1:
                   System.out.println("THINK ANY NUMBER");
               break;
           case 2:
               System.out.println("ADD SAME NUMBER WHAT YOU THINK");
               
               break;
           case 3:
               System.out.printf("add %d in number \n",rand);
               
               break;
           case 4:
               System.out.println("minus half in your total number");
               
               break;
           case 5:
               System.out.println("minus number what you add in first step");
               
               break;
           case 6:
               int ans = rand/2;
               System.out.printf("i am sure you think this: %d\n",ans);
               
               break;
           case 7:
               System.exit(0);
               break;
       
           default:
       }
      }while(true);
    }
    
    
    
    public static int funct(){
        SecureRandom random = new SecureRandom();
        int temp = random.nextInt(100);
        if(temp%2 == 0){
        return temp;
        }else if(temp%2 != 0){
            temp++;
            return temp;
        }else{
        return temp;
        }
    
    }
    
}
