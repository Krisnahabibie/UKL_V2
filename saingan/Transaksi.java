/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saingan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class Transaksi extends JenisLaundry{
    
        private ArrayList<Integer> idJenis = new ArrayList<Integer>();
        private ArrayList<Integer> banyak = new ArrayList<Integer>();
        private ArrayList<Integer> idClient = new ArrayList<Integer>();
       
       int id;
    public void clnt(Client client){
        Scanner input = new Scanner(System.in);
        System.out.println("\t");
        System.out.println("=====Silahkan Laundry=====");
        System.out.println("\t");
        System.out.println("Masukkan ID Member");
        //int idClient untuk mencari id inputan user di class client
        id = input.nextInt();
        System.out.println("\t");
        System.out.println("Selamat Datang ");
        System.out.println("Nama : "+client.getNama(id));
        System.out.println("Alamat : "+client.getAlamat(id));
        System.out.println("Telepon : "+client.getTelepon(id));
        System.out.println("Saldo : "+client.getSaldo(id));
            System.out.println("\t");
    }
        //obj extends JenisLaundry
        public void prosesTransaksi(Client klient,JenisLaundry jenislaundry, Petugas petugas){
        Scanner input = new Scanner(System.in);     
        
        int i=0;
        int temp=0;  //modifier untuk menyimpan nilai sementara
        do{
        System.out.println("Pilih jenis :");
        temp=input.nextInt();
            System.out.println("\t");
        if (temp==0){
        idJenis.add(temp);
        System.out.print(jenislaundry.getNamaJenis(idJenis.get(i)));
          System.out.println(" sebanyak : "+" kilo");
        banyak.add(input.nextInt());
            System.out.println("\t");
        }else if(temp ==1){
          idJenis.add(temp);
        System.out.print(jenislaundry.getNamaJenis(idJenis.get(i)));
          System.out.println(" sebanyak : "+" kilo");
        banyak.add(input.nextInt());
        }else if(temp == 2){
            idJenis.add(temp);
        System.out.print(jenislaundry.getNamaJenis(idJenis.get(i)));
          System.out.println(" sebanyak : "+" kilo");
        banyak.add(input.nextInt());
        }
        }while (temp>2);
        System.out.println("Transaksi belanja "+klient.getNama(id)+" sebagai berikut");
        System.out.println("Nama jenis \tHarga \tJumlah \tpengerjaan\tpetugas");
          //variabel data jumlah
        int Total = 0;
        int x = idJenis.size();
        int j;
        for (j = 0; j < x; j++){
          //perhitungan jumlah
        int jumlah=banyak.get(j);
        Total=jumlah*jenislaundry.getHarga(idJenis.get(j));
        System.out.println(jenislaundry.getNamaJenis(idJenis.get(j))+"\t"+"\t"+
        jenislaundry.getHarga(idJenis.get(j))+"\t"+
        jumlah+" kilo"+"\t"+jenislaundry.getDurasi(idJenis.get(j))+" hari"+"\t"+"\t"+petugas.getNama(j));
        }
        System.out.println("Total Belanja : "+Total);
        int saldo = klient.getSaldo(id)-Total;
          System.out.println("Saldo : "+saldo);
        }
   }

