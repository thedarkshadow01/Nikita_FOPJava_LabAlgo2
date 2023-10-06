/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;
import java.util.*;
/**
 *
 * @author Nikita
 */
public class currency_denomination {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of currency denominations: ");
        int d= s.nextInt();
        int denomination[]= new int[d];
        System.out.println("Enter the currency denomination value: "); 
        for(int i=0;i<d;i++){
            denomination[i]= s.nextInt();
        }        
        Arrays.sort(denomination);
        System.out.println("Enter the amount you want to pay: ");  
        int amt= s.nextInt();
        int notes[] = new int[d];
        for(int i=d-1;i>=0;i--){
            while(amt >= denomination[i]){
                amt-= denomination[i];
                notes[i]++;
            }
        }
         System.out.println("Your payment approach in order to give the minimum number of notes will be: ");
         for(int i=d-1;i>=0;i--){
             if(notes[i]>0){
                  System.out.println(denomination[i]+":"+notes[i]); 
             }
         }
    }
}
