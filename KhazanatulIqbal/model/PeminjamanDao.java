/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhazanatulIqbal.model;
import KhazanatulIqbal.model.*;
import KhazanatulIqbal.model.Peminjaman;
import java.util.List;
/**
 *
 * @author LABMM07
 */
public interface PeminjamanDao {
    void save (Peminjaman peminjaman);
    void update (int index, Peminjaman peminjaman);
    void delete (int index);
    Peminjaman getPeminjaman(int index);
    List<Peminjaman> getAllPeminjaman();
}