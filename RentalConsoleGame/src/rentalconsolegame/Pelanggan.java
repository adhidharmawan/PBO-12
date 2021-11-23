/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;
import java.util.Scanner;
import java.time.*;

/**
 *
 * @author User
 */
public class Pelanggan {
    public String idMember;
    public String nama;
    public String jenisMember;
    public int tglPinjam;
    public int blnPinjam;
    public int thnPinjam;
    public int tglKembali;
    public int blnKembali;
    public int thnKembali;
    
    //constructor
    Pelanggan(String nama, String jenisMember){
        this.nama = nama;
        this.jenisMember = jenisMember;
    }
    
    //input id member, 
    //tgl, bln, tahun pinjam
    //tgl, bln, tahun kembali
    public void input(){
       Scanner input = new Scanner(System.in);
       System.out.println("============================== ");
        System.out.print("Masukan ID Member             : ");
        this.idMember = input.nextLine();
        System.out.print("Masukan Tanggal Pinjam (1-31) : ");
        this.tglPinjam = input.nextInt();
        System.out.print("Masukan Bulan Pinjam (1-12)   : ");
        this.blnPinjam = input.nextInt();
        System.out.print("Masukan Tahun Pinjam          : ");
        this.thnPinjam = input.nextInt();
        
        System.out.print("Masukan Tanggal Kembali (1-31): ");
        this.tglKembali = input.nextInt();
        System.out.print("Masukan Bulan Kembali (1-12)  : ");
        this.blnKembali= input.nextInt();
        System.out.print("Masukan Tahun Kembali         : ");
        this.thnKembali= input.nextInt();   

    }
    
    //menghitung lama peminjaman
    public long hitungLama(){
        LocalDate from = LocalDate.of(thnPinjam, blnPinjam, tglPinjam);
        LocalDate to = LocalDate.of(thnKembali, blnKembali, tglKembali);
        Period selisih = Period.between(from, to);
        int lama = selisih.getYears() * 365 + selisih.getMonths()*31 
                + selisih.getDays();
        return lama;
    }
    
    //menghitung biaya sewa
    public long hitungSewa(){
        long sewa = 0;
        if (this.jenisMember == "Silver"){
            sewa = 25000 * this.hitungLama();
        }
        else if (this.jenisMember == "Gold"){
            sewa = 30000 * this.hitungLama();
        }
        else if (this.jenisMember == "Platinum"){
            sewa = 45000 * this.hitungLama();
        }
        return sewa;
    }
    
    //ouput data pelanggan dan biaya sewa sebelum diskon
    public void printPelanggan(){
        System.out.println("============================== ");
        System.out.println("ID Member       : "+ this.idMember);
        System.out.println("Nama Member     : "+ this.nama);
        System.out.println("Jenis Member    : "+ this.jenisMember);
        System.out.println("");
        System.out.println("Tanggal Pinjam  : "+ this.tglPinjam+"-"+blnPinjam+"-"+thnPinjam);
        System.out.println("Tanggal Kembali : "+ tglKembali+"-"+blnKembali+"-"+thnKembali);
        System.out.println("Lama Sewa       : "+ this.hitungLama());
        System.out.println("");
        System.out.println("Total Sewa      : "+ this.hitungSewa());
        System.out.println("============================== ");
    }
}
