/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saingan;

import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class Saingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sapa
        System.out.println("selamat datang di laundry");
        System.out.println("\t");
        //petugas
        Petugas petugas = new Petugas();
        System.out.println("Petugas yang berjaga:");
        System.out.println("Nama : "+petugas.getNama(0));
        System.out.println("Jabatan : "+petugas.getJabatan(0));
        System.out.println("Alamat : "+petugas.getAlamat(0));
        System.out.println("Telepon : "+petugas.getTelepon(0));
        
        Client user = new Client();
        Scanner input = new Scanner (System.in);
        System.out.println("\t");

        Transaksi trans = new Transaksi();
        trans.clnt(user);
        
        //program lanjut
        String lanjut;
        System.out.println("ketik lanjut");
        lanjut=input.next();
        System.out.println("\t");
        //pemilihan jenis
        
        if(lanjut.equalsIgnoreCase("lanjut")){
         /*   System.out.println("Jenis Laundry");
            System.out.println("\t");
            System.out.println("id = 0");
            System.out.println("Tingkat : "+trans.getNamaJenis(0));
            System.out.println("Durasi : "+trans.getDurasi(0)+" hari");
            System.out.println("Harga : "+trans.getHarga(0)+"/kilo");
            
            System.out.println("\t");
            System.out.println("id = 1");
            System.out.println("Tingkat : "+trans.getNamaJenis(1));
            System.out.println("Durasi : "+trans.getDurasi(1)+" hari");
            System.out.println("Harga : "+trans.getHarga(1)+"/kilo");
            
            System.out.println("\t");
            System.out.println("id = 2");
            System.out.println("Tingkat : "+trans.getNamaJenis(2));
            System.out.println("Durasi : "+trans.getDurasi(2)+" hari");
            System.out.println("Harga : "+trans.getHarga(2)+"/kilo"); */
            
            for (int i = 0; i < 3; i++)
            {
                System.out.println("id : " + i);
                System.out.println("Tingkat : " + trans.getNamaJenis(i));
                System.out.println("Durasi : " + trans.getDurasi(i) + " hari");
                System.out.println("Harga : " + trans.getHarga(i)+ "/kilo");
                
            }
        }else{
            System.out.println("silahkan ulang kembali");
        }
        System.out.println("\t");
        
        //transaksi
        if(lanjut.equalsIgnoreCase("lanjut")){
        trans.prosesTransaksi(user, trans, trans, petugas);
        }else{
            
        }
    }
    
}
