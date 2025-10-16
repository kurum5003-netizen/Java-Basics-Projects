/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polindrom;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Polindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //bu program bir sayının palindrom olup olmadığını bulmaya yarıyor
       Scanner scanner = new Scanner(System.in);
       
       String a; int i,j=0;
        System.out.println("polindrom ifade girin");
       a=scanner.nextLine();//string değişkenimizi aldık
       
       for(i=0;i<a.length();i++){
           
           if(a.charAt(i)!= a.charAt(a.length()-i-1)){//charAt burda sanki string ifadeyi arraymiş gibi yönetiyor
               j=1;
                       break;
           }
           
           
       }
       
       if(j==1){
           System.out.println("palindrom degil");
       }
           
       else{
           System.out.println("palindrom");
       }
           
       
       
       
       
    }
    
}
