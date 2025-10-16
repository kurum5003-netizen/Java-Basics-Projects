/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faktoplam;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Faktoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //bu program n sayısına kadar olan tüm faktöriyelleri topluyor
       Scanner scanner=new Scanner(System.in);
       int toplam=0,fak,j,i;
        System.out.println("ilk kaç sayının fak toplamını alalım");
        i=scanner.nextInt();
       while(i>=0){ //dış döngü sayıların n e kadar ilerlemesinde görev alıyor
           fak=1;
           j=i;
           while(j>0){ // iç döngü ise osayının faktöriyelini alıyor
               fak=fak*j--;
               
               
               
           }
             toplam+=fak;
             i--;
       
           
           
       }
       
        System.out.println(toplam);
       
       
       
       
       
    }
    
}
