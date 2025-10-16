/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringintdegerbulma;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Stringintdegerbulma {
    public static void main(String[] args) {
        //bu program girilen string ifadenin içinde rakam var ise o rakamalrın toplamını bulmaya yarıyor
        Scanner scanner = new Scanner(System.in);
        System.out.println("String giriniz:");
        String a = scanner.nextLine();
        int toplam = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);//burda stringin her dizisini char a dönüştürüyoruz isdigit fank. kullanbilmek için
            if (Character.isDigit(c)) {//isdigit burda c char ifadesinin sayı olup olamdığını kontrol ediyor
                toplam += Character.getNumericValue(c);//getnumericvalue ise o sayı stringini int e çeviriyor
            }
        }

        System.out.println("Rakamların toplamı: " + toplam);
    }
}