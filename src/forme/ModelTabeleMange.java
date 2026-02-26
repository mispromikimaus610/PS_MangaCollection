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
    private final String[] kolone= {"Id","Naziv", "Autor", "ISBN", "Godina Izdanja","Zanr","Tom" ,"Poslednji Tom"};
    
    public ModelTabeleMange(List<Manga> listaMangi){
        this.listaMangi=listaMangi;
        
    }

    public List<Manga> getListaMangi() {
        return listaMangi;
    }

    public void setListaMangi(List<Manga> listaMangi) {
        this.listaMangi = listaMangi;
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
                 return manga.getId();
            }
             case 1 -> {
                 return manga.getNaziv();
            }
             case 2 -> {
                 return manga.getAutor();
            }
             case 3 -> {
                 return manga.getISBN();
            }
             case 4 -> {
                 return manga.getGodinaIzdanja();
            }
             case 5 -> {
                 return manga.getZanr();
            }
             case 6 -> {
                 return manga.getTom();
            }
             case 7 -> {
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
