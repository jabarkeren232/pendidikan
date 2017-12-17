package com.example.win7.belajarbindoxi;

import java.io.Serializable;

/**
 * Created by win7 on 14/11/2017.
 */
public class ModelMateri implements Serializable{
    String tittle,image,judul,isi,isi2;

    public String getTittle(){
        return tittle;
    }
    public void setTittle(String tittle){
        this.tittle = tittle;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getIsi(){
        return isi;
    }
    public void setIsi (String isi){
        this.isi = isi;
    }
    public String getIsi2(){
        return isi2;
    }
    public void setIsi2(String isi2){
        this.isi2 = isi2;
    }
}
