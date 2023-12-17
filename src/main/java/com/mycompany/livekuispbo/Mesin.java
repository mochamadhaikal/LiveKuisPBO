/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livekuispbo;

/**
 * @author Haikal
 */

public class Mesin {
    protected String merk;
    protected boolean menyala;
    protected int kecepatan;

    public Mesin(String merk) {
        this.merk = merk;
        this.menyala = false;
        this.kecepatan = 0;
    }

    public void nyalakanMesin() {
        menyala = true;
        System.out.println("Mesin dinyalakan");
    }

    public void matikanMesin() {
        menyala = false;
        kecepatan = 0;
        System.out.println("Mesin dimatikan");
    }

    public void tambahKecepatan() {
        if (menyala) {
            kecepatan += hitungTambahKecepatan();
            batasiKecepatan();
            System.out.println("Kecepatan saat ini: " + kecepatan + " Km/jam");
        } else {
            System.out.println("Mesin belum dinyalakan");
        }
    }

    public void kurangKecepatan() {
        if (menyala) {
            kecepatan -= hitungKurangKecepatan();
            batasiKecepatan();
            System.out.println("Kecepatan saat ini: " + kecepatan + " Km/jam");
        } else {
            System.out.println("Mesin belum dinyalakan");
        }
    }

    protected int hitungTambahKecepatan() {
        return 0;
    }

    protected int hitungKurangKecepatan() {
        return 0;
    }

    protected void batasiKecepatan() {
        if (kecepatan < 0) {
            kecepatan = 0;
        } else if (kecepatan > 300) {
            kecepatan = 300;
        }
    }
}

