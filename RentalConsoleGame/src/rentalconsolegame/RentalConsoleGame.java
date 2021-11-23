/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author User
 */
public class RentalConsoleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MemberSilver s1 = new MemberSilver("Mr. X", "Silver");
        s1.input();
        s1.printPelanggan();
        
        MemberGold g1 = new MemberGold("Mr. Y", "Gold");
        g1.input();
        g1.printPelanggan();
        
        MemberPlatinum p1 = new MemberPlatinum("Mr. Y", "Platinum");
        p1.input();
        p1.printPelanggan();
  
    }
    
}
