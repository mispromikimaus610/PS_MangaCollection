/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forme;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Manga;

/**
 *
 * @author milos
 */

public class ModelTabeleMange extends AbstractTableModel {
    private List<Manga> listaMangi;
    private final String[] kolone= {"Naziv", "Autor", "ISBN", "Godina Izdanja","Zanr","Tom" ,"Poslednji Tom"};
    
    public ModelTabeleMange(List<Manga> listaMangi){
        this.listaMangi=listaMangi;
        
    }
    
    
    @Override
    public int getRowCount() {
       return listaMangi.size();
    }

    @Override
    public int getColumnCount() {
       return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Manga manga = listaMangi.get(rowIndex);
         switch(columnIndex){
             case 0 -> {
                 return manga.getNaziv();
            }
             case 1 -> {
                 return manga.getAutor();
            }
             case 2 -> {
                 return manga.getISBN();
            }
             case 3 -> {
                 return manga.getGodinaIzdanja();
            }
             case 4 -> {
                 return manga.getZanr();
            }
             case 5 -> {
                 return manga.getTom();
            }
             case 6 -> {
                 return manga.getPoslednjiTom();
            }
             default -> {
                 return "N/A";
            }
         }    
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    void osveziPodatke() {
        fireTableDataChanged();
    }
    
    
}
