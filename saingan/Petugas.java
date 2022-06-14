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

    public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
public Petugas() {
this.namaPetugas.add("Sujono");
this.alamat.add("MARS");
this.telepon.add("081112223333");
this.jabatan.add(0);
}
public void setJabatan(int jabatan ){
this.jabatan.add(jabatan);
}
public int getJabatan(int id){
return this.jabatan.get(id);
}
@Override
public void setNama(String namaPetugas ){
this.namaPetugas.add(namaPetugas);
}
@Override
public void setAlamat(String alamat ){
this.alamat.add(alamat);
}
@Override
public void setTelepon(String telepon ){
    this.telepon.add(telepon);
}
@Override
public String getNama(int idPetugas){
return this.namaPetugas.get(idPetugas);
}
@Override
public String getAlamat(int idPetugas){
return this.alamat.get(idPetugas);
}
@Override
public String getTelepon(int idPetugas){
return this.telepon.get(idPetugas);
}
    }

