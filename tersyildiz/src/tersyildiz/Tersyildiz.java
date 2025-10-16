/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tersyildiz;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Tersyildiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //bu program o numaralı satır kadar o satırda yıldız bulunacak şekilde tersten yıldız yazdırmaya yarıyor
        Scanner scanner=new Scanner(System.in);
       int n,j;
           
         
        System.out.println("kaç satır olsun");
        n=scanner.nextInt();
        
        while(n>0){
            
            
            j=0;
            while(j<n){
                System.out.print("*");
                j++;
                
            }
            System.out.println("");//burda bir alt satıra indiriyoruz
                    
                    
            
            n--;
            
        }
        
        
        
    }
    
}
