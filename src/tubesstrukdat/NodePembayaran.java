/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesstrukdat;

/**
 *
 * @author msj
 * 1117048  Juan Wilson Nara
 * 1118009  Michael Septian Jaya
 * 1119001  Dave Nathaniel Kertaatmadja
 * 1119023  Jedediah Fanuel
 * 
 */
class Pembayaran {
    String idStudent;
    int tanggal;
    int bulan;
    int tahun;
    int pay;
}

public class NodePembayaran {
    Pembayaran data = new Pembayaran();
    NodePembayaran next;
}
