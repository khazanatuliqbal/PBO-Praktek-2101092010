/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhazanatulIqbal.model;
import java.util.List;
/**
 *
 * @author hp
 */
public interface PengembalianDao {
     void save(Pengembalian pengembalian);
    void update(int index, Pengembalian pengembalian);
    void delete (int index);
    Pengembalian getPengembalian(int index);
    List<Pengembalian> getAllPengembalian();
}
