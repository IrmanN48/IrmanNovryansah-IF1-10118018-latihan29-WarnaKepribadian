/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan29.warnakepribadian;

import java.util.Scanner;
import static Warna.java.BLACK;
import static Warna.java.BLUE;
import static Warna.java.BLUE2;
import static Warna.java.BLUE_BACKGROUND;
import static Warna.java.GREEN;
import static Warna.java.GREEN_BACKGROUND;
import static Warna.java.PURPLE;
import static Warna.java.PURPLE_BACKGROUND;
import static Warna.java.RED;
import static Warna.java.RED_BACKGROUND;
import static Warna.java.RESET;
import static Warna.java.WHITE;
import static Warna.java.YELLOW;
import static Warna.java.YELLOW_BACKGROUND;
import static Warna.java.hasilTest;
public class Latihan29WarnaKepribadian {
    
    /**
    *
    * @author Aero
    * NAMA  : IRMAN NOVRYANSAH
    * KELAS : IF 1
    * NIM   : 10118018
    * Deskripsi Program : Program ini untuk menampilkan kepribadian sesuai dengan 
    *                     inputan warna yang dipilih.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        //variabel
        String warnaMu;
        String namaMu;
        Scanner scn = new Scanner(System.in);
        
        //input
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        
        System.out.println(RED + "YUK " + GREEN + ("CEK ") + YELLOW 
                + ("KEPRIBADIANMU ") + BLUE2 + ("DARI ") + PURPLE + 
                ("WARNA ") + BLUE + ("FAVORITMU\n")+RESET);
        
        //warna
        System.out.println(RED_BACKGROUND + WHITE + "\tMERAH\t\t");
        System.out.println(GREEN_BACKGROUND + WHITE + "\tHIJAU\t\t");
        System.out.println(YELLOW_BACKGROUND + WHITE + "\tKUNING\t\t");
        System.out.println(BLUE_BACKGROUND + WHITE + "\tBIRU\t\t");
        System.out.println(PURPLE_BACKGROUND + WHITE + "\tUNGU\t\t\n" + RESET);
        
        //input pilih warna
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print(BLACK + "NAMA KAMU : ");
        namaMu = scn.next();
        
        
        
         //output hasil
         System.out.println("===HASIL TEST KEPRIBADIAN "+namaMu+("==="));
         System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase()+"====");
        hasilTest(warnaMu);
    }
    
    
}
