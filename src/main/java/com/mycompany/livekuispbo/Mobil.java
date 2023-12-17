/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livekuispbo;

/**
 * @author Haikal
 */

public class Mobil extends Mesin {
    public Mobil(String merk) {
        super(merk);
    }

    @Override
    protected int hitungTambahKecepatan() {
        if (merk.equals("Honda")) {
            return 10;
        } else if (merk.equals("Suzuki")) {
            return 15;
        } else if (merk.equals("Nissan")) {
            return 20;
        }
        return 0;
    }

    @Override
    protected int hitungKurangKecepatan() {
        if (merk.equals("Honda")) {
            return 5;
        } else if (merk.equals("Suzuki")) {
            return 10;
        } else if (merk.equals("Nissan")) {
            return 15;
        }
        return 0;
    }

    @Override
    protected void batasiKecepatan() {
        super.batasiKecepatan();
        if (merk.equals("Suzuki") && kecepatan > 150) {
            kecepatan = 150;
        }
    }
}

