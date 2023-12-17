/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livekuispbo;

/**
 * @author Haikal
 */

public class Main {
    public static void main(String[] args) {
        Mobil mobilHonda = new Mobil("Honda");
        Mobil mobilSuzuki = new Mobil("Suzuki");
        Mobil mobilNissan = new Mobil("Nissan");

        mobilHonda.nyalakanMesin();
        mobilHonda.tambahKecepatan();
        mobilHonda.kurangKecepatan();
        mobilHonda.matikanMesin();

        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.nyalakanMesin();
        mobilSuzuki.tambahKecepatan();
        mobilSuzuki.kurangKecepatan();
        mobilSuzuki.matikanMesin();

        mobilNissan.nyalakanMesin();
        mobilNissan.tambahKecepatan();
        mobilNissan.kurangKecepatan();
        mobilNissan.matikanMesin();
    }
}

