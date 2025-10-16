/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basithesapmak;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Basithesapmak {
    
    public static void toplam(int a,int b){
        System.out.println(a+b);
    }
    
    public static void toplam (int a,int b,int c){
        
            System.out.println(a+b+c);
        
    }
     public static void bölme(int a,int b){
        System.out.println((double)a/b);
    }
      public static void çarpma(int a,int b){
        System.out.println(a*b);
    }
       public static void çarpma(int a,int b,int c){
        System.out.println(a*b*c);
    }
       
   public static void çıkarma(int a,int b){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        //bu program methodlarda overloading ile basit hesap makinesi yapımıdır
      Scanner scanner =new Scanner(System.in);
        
        String b,a = "1.islem toplama\n" + "2.islem çıkarma\n" + "3.islem bölme\n " +
        "4.islem çarpma\n" + "çıkış için q ya basın";
        int c,d,e,f;
        
        System.out.println("********************************");
        System.out.println(a);
        System.out.println("********************************");
        
        while(true){
            System.out.println("işlem seçin:");
            b=scanner.nextLine();
            if(b.equals("1")){
                System.out.println("kaç adet sayı gireceksiniz");
                c=scanner.nextInt();
                scanner.nextLine();
                if(c==2){
                    System.out.println("1.sayıyı giriniz:");
                    d=scanner.nextInt();
                    System.out.println("2.sayıyı giriniz:");
                    e=scanner.nextInt();
                    scanner.nextLine();//bu boş scannerlar scannerden kaynaklanan karmaşayı çözmek için konulmuştur
                    toplam(d,e);
                }
                else if(c==3){
                     System.out.println("1.sayıyı giriniz:");
                    d=scanner.nextInt();
                    System.out.println("2.sayıyı giriniz:");
                    e=scanner.nextInt();
                    System.out.println("3.sayıyı giriniz:");
                    f=scanner.nextInt();
                    scanner.nextLine();
                    toplam(d,e,f);

                    
                    
                    
                    
                }
                else{
                    System.out.println("geçersiz sayı");
                    
                }
                    
            }
              if(b.equals("3")){
                System.out.println("kaç adet sayı gireceksiniz");
                c=scanner.nextInt();
                scanner.nextLine();
                if(c==2){
                    System.out.println("1.sayıyı giriniz:");
                    d=scanner.nextInt();
                    System.out.println("2.sayıyı giriniz:");
                    e=scanner.nextInt();
                    scanner.nextLine();
                    çarpma(d,e);
                }
                else if(c==3){
                     System.out.println("1.sayıyı giriniz:");
                    d=scanner.nextInt();
                    System.out.println("2.sayıyı giriniz:");
                    e=scanner.nextInt();
                    System.out.println("3.sayıyı giriniz:");
                    f=scanner.nextInt();
                    scanner.nextLine();
                    çarpma(d,e,f);

                    
                    
                    
                    
                }
                else{
                    System.out.println("geçersiz sayı");
                    
                }
                    
            }
              if(b.equals("2")){
                    System.out.println("1.sayıyı giriniz:");
                    d=scanner.nextInt();
                    System.out.println("2.sayıyı giriniz:");
                    e=scanner.nextInt();
                    scanner.nextLine();
                    bölme(d,e);
                }
            
              if(b.equals("4")){
                    System.out.println("1.sayıyı giriniz:");
                    d=scanner.nextInt();
                    System.out.println("2.sayıyı giriniz:");
                    e=scanner.nextInt();
                    scanner.nextLine();
                    çıkarma(d,e);
                }
            
            if(b.equals("q")){
                System.out.println("çıkış ypılıyor...");
                break;
            }
            
        }
        
        
        
        
        
        
        
        
    }
    
}
