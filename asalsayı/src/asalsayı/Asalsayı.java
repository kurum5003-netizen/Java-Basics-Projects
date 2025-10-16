/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalsayı;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Asalsayı {
    public static void main(String[] args) { 
        //Bu program 1 den n e kadar olan asal sayıları gösteriyor
        Scanner scanner = new Scanner(System.in);
        int i = 2, k, n;  // 1 asal değil, 2 den başlıyoruz
        
        System.out.println("Sayıyı giriniz:"); 
        n = scanner.nextInt(); //n sayısını alıyoruz burda
        
        while (i <= n) {
            boolean asal = true;
            k = 2; //burdaki k değişkeni ile i nin asal olup olmadığını kontrol ediyoz
            
            while (k <= i / 2) {
                if (i % k == 0) {   // böleni varsa asal değildir
                    asal = false;
                    break;
                }
                k++; //k yı artırır
            }
            
            // sadece asal olanları yazdır
            if (asal) {
                System.out.println(i);
            }
            
            i++;
        }
    }
}
