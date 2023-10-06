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
public class Paymoney {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of transaction array: ");
        int transact= s.nextInt();
        int transact_array[]= new int[transact];
        
        System.out.println("Enter the values of array: ");
        for(int i=0;i<transact;i++){
            transact_array[i]= s.nextInt();
        }
        
        System.out.println("Enter the total number of targets that need to be achieved: ");
        int tot_target= s.nextInt();
        for(int i=0;i<tot_target;i++){
            System.out.println("Enter the value of target");
            int target= s.nextInt();
            int sum=0;
            int transaction_needed= 0;
            for(int j=0;j<transact;j++){
                sum= sum+transact_array[j];
                transaction_needed++;
                if(sum>= target){
                    System.out.println("Target achieved after "+ transaction_needed+" transactions");
                    break;
                }
            }
            if(sum<target){
                System.out.println("Given target is not achieved");
            }
        }
    }
}
