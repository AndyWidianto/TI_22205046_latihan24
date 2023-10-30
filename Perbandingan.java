/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo.perbandingan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
/** nama : Andy widianto
 *  nim  : 22205046
 */
public class Perbandingan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;
        System.out.println("============Program Perbandingan Nilai ============");
        do{
        System.out.print("Masukan Nilai pertama :");
        int input = sc.nextInt();
        System.out.print("Masukan Nilai kedua :");
        int input2 = sc.nextInt();
        if(input < input2){
            System.out.println("Hasil :"+input+" Kurang dari "+input2);
        }
        else if(input == input2){
            System.out.println("Hasil :"+input +" Sama" +input2);
        }
        else{
            System.out.println("Hasil :"+input+" Lebih dari "+input2);
        }
            System.out.print("Ulangi Aktivitas? ya/tidak :");
            ulang = sc.next();
        }
         while( ulang.equals("ya")&&true);
        System.out.println("Terimakasih loo");
    }
        }
