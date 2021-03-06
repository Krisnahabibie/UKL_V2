/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saingan;

import java.util.ArrayList;

/**
 *
 * @author krisn
 */
public class Client implements User{
    private ArrayList<String> namaClient = new ArrayList <String>();
    private ArrayList<String> alamat = new ArrayList <String>();
    private ArrayList<String> telepon = new ArrayList <String>();
    private ArrayList<Integer> saldo = new ArrayList <Integer>();
    //pengisian set
    public Client() {
        this.namaClient.add("BAGONG");
        this.alamat.add("GUNUNG MERAPI");
        this.telepon.add("08123456666");
        this.saldo.add(100000);

        this.namaClient.add("PRAKOSO");
        this.alamat.add("GUNUNG RINJANI");
        this.telepon.add("08123456789");
        this.saldo.add(50000);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }

    @Override
    public void setNama(String namaClient ){
        this.namaClient.add(namaClient);
    }
    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }
    
    public String getNama(int idClient){
         return this.namaClient.get(idClient);
    }
    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    @Override
    public String getTelepon(int idClient){
        return this.telepon.get(idClient);
    }
    
}

      